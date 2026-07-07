package Com.basicsHibernateConnections;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.BasicsHibernate.model.StudentTable;

public class HibernateConnectionsUsingPropertiesFile {

	public static void main(String[] args) {
Configuration config=null;
Session session=null;
Transaction transaction=null;
boolean flag=false;
try {
	config=new Configuration();
	config.addProperties(new Properties() {{
		load(HibernateConnectionsUsingPropertiesFile.class.getClassLoader()
				.getResourceAsStream("hibernate1.properties")
				);
	}});
//Explanation for above each line in the code is given below
//config is a Hibernate Configuration object.addProperties() tells Hibernate:
//"Use these properties (database URL, username, password, dialect, etc.) while creating the SessionFactory."
//new Properties() {{ Properties is a Java class that stores data as key-value pairs.
//Example:hibernate.connection.url=jdbc:mysql://localhost:3306/test
//hibernate.connection.username=root	Internally it becomes
//Key	                                  Value
// hibernate.connection.url	          jdbc:mysql://localhost:3306/test
// Creates a Properties object to store Hibernate configuration as key-value pairs.
//load() Reads the properties file and loads all key-value pairs into the Properties object.
//HibernateConnectionsUsingPropertiesFile.class-->Gets the Class object of HibernateConnectionsUsingPropertiesFile.
//.getClassLoader()Every Java class is loaded by a ClassLoader.
//The ClassLoader knows where resources are located (classes, properties files, XML files).
//In a Maven project it searches the application's classpath.
//For a standard Maven project, src/main/resources is copied to the classpath during the build, 
//so resources placed there can be found.
// Gets the ClassLoader used to load this class.It can be used to load resources available on the application's classpath.
//.getResourceAsStream("hibernate1.properties")This asks the ClassLoader:
//"Find hibernate1.properties on the classpath and give me an InputStream to read it."
//if the file exists then it returns an InputStream.
//If the file doesn't exist, it returns null.
	
	config.addAnnotatedClass(StudentTable.class);
	session=config.buildSessionFactory().openSession();
	transaction=session.beginTransaction();
	StudentTable st=new StudentTable();
	//st.setId(11);
	st.setAge(22);
	st.setCity("Erode");
	st.setName("Gowtham");
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date dob = null;
	dob = sdf.parse("22-09-2004");
	st.setDateOfBirth(dob);
	session.persist(st);
	flag=true;
	
}
catch(HibernateException e) {
	e.printStackTrace();
}
catch(Exception e1) {
	e1.printStackTrace();
}
finally {
	if(flag) {
		transaction.commit();
	}else {
		transaction.rollback();
	}
	session.close();
}
	}

}
