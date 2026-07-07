package Com.basicsHibernateConnections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.BasicsHibernate.model.StudentTable;

public class LaunchApplicationClass {

	public static void main(String[] args) {
        //First Configuration Object
		Configuration config=new Configuration();
		//Second configure hibernate.cfg.xml file to Configuration object
		//If we change the already created name , we need to give the fully qualified name
		config.configure();
		
		//Third create sessionfactory object
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		//Four Build the session object from SessionFactory
		Session session=sessionFactory.openSession();
		
		//Five Begin the Transaction with the session
		Transaction transaction=session.beginTransaction();
		
		StudentTable student=new StudentTable();
		student.setId(2);
		student.setName("Ramachandran");
		student.setCity("Mumbai");
		student.setAge(29);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date dob = null;
		try {
			dob = sdf.parse("22-09-1991");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		student.setDateOfBirth(dob);
		
		//Six Perform Operation
		session.save(student);
		//Seven perform transaction operations
		transaction.commit();
		
		//Eight close the resources
		session.close();
	}
	
	

}
