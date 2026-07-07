package Com.basicsHibernateConnections;
//Hibernate Level 1 Cache (First-Level Cache)
//1.Level 1 Cache is enabled by default in Hibernate.
  //Every Session has its own Level 1 Cache.
  //It is created automatically when a Session is created.
//2.When you fetch an entity from the database using methods like get(), load(), or getReference(), 
    //Hibernate stores that entity in the Level 1 Cache.
//Database
//    ↓
//Hibernate Session
//    ↓
//Level 1 Cache
//3.If you request the same entity (same primary key) again within the same Session, 
  //Hibernate does not execute another SQL query.
  //Instead, it returns the entity directly from the Level 1 Cache.
//4.If you open a new Session, a new Level 1 Cache is created.So fetching the same entity again will execute the SQL query.

//5. Advantages of Level 1 Cache
// It reduces unnecessary database queries.
// It decreases database load.
// It improves application response time.
// It ensures only one managed entity instance exists for a given primary key within a Session.

//Important Point
//If the same entity with the same primary key (ID) is requested again within the same Session, 
//Hibernate retrieves it from the Level 1 Cache instead of executing another SQL query.

//Very Important Point
//If the same entity , same primary key and same session already returns as null 
 //It will hit the database again.why:
//Level 1 Cache stores only managed entity objects.
//If session.get(Employee.class, 101) returns null, it means no entity was found.
//Since there is no entity object to store, Level 1 Cache does not cache null as an entity.

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import Com.BasicsHibernate.model.EmployeeTable;


public class Level1CacheHibernate {

	public static void main(String[] args) {
		Configuration config=null;
	      Session session=null;
	      Session session1=null;
	      try {
	    	   session=new Configuration().addAnnotatedClass(EmployeeTable.class).configure().buildSessionFactory().openSession();
	    	  // session1=session;//In this new level1 cache will not be created because
	    	                   // session and session1 point to the same Session.
	    	                   //There is only one Level 1 Cache.
	    	                  // session loads an entity, session1 can access the same cached entity because they share the same Session.
	    	   session1=new Configuration().addAnnotatedClass(EmployeeTable.class).configure().buildSessionFactory().openSession();;
	    	   EmployeeTable employeeTable = session.get(EmployeeTable.class, 1);
	    	   System.out.println(employeeTable);
             //If i use the same session object to execute the same entity with an same primary key	the query will not print 
	    	   //it will fetch from level 1 cache 
	    	   EmployeeTable employeeTable1 = session.get(EmployeeTable.class, 1);
	    	   System.out.println(employeeTable1);
	    	   //It will hit the database because primary key id is changed
	    	   EmployeeTable employeeTable2 = session.get(EmployeeTable.class, 2);
	    	   System.out.println(employeeTable2);
	    	   
	    	   //It will hit the database because new session is created so new level 1 cache is created
	    	   EmployeeTable employeeTable3 = session1.get(EmployeeTable.class, 1);
	    	   System.out.println(employeeTable3);
	    	   
	    	   //It will not hit the databsase because same session ,same primary key and same entity
	    	   EmployeeTable employeeTable4 = session1.get(EmployeeTable.class, 1);
	    	   System.out.println(employeeTable4);
	      }
	      catch(HibernateException e) {
	    	  e.printStackTrace();
	      }
	      catch(Exception e1) {
	    	  e1.printStackTrace();
	      }
	      finally {
	    	  session.close();
	      }
		
		
		
		
		
	}

}
