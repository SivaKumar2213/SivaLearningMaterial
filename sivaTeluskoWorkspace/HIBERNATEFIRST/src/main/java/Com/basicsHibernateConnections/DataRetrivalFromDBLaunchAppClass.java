package Com.basicsHibernateConnections;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import Com.BasicsHibernate.model.EmployeeTable;

public class DataRetrivalFromDBLaunchAppClass {

	public static void main(String[] args) {
      Configuration config=null;
      Session session=null;
      try {
    	   session=new Configuration().addAnnotatedClass(EmployeeTable.class).configure().buildSessionFactory().openSession();
    	   EmployeeTable employeeTable = session.get(EmployeeTable.class, 1);
    	   System.out.println(employeeTable);
    	  
    	  
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
