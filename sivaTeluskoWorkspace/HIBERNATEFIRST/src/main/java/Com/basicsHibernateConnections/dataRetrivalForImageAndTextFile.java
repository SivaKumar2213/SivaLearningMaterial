package Com.basicsHibernateConnections;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import Com.BasicsHibernate.model.LaptopDetails;

public class dataRetrivalForImageAndTextFile {

	public static void main(String[] args) {
Configuration config=null;
Session session=null;
FileOutputStream fos=null;
FileWriter writer=null;
try {
	config=new Configuration();
	config.setProperties(new Properties() {
		{
			load(HibernateLOBannotationLargeObject.class.getClassLoader().getResourceAsStream("hibernate1.properties"));
		}
		
	});
	config.addAnnotatedClass(LaptopDetails.class);
	session=config.buildSessionFactory().openSession();
	LaptopDetails lapDet=session.get(LaptopDetails.class, 1);
	fos=new FileOutputStream("laptopImage.jpg");
	fos.write(lapDet.getImage());
	writer=new FileWriter("laptopDet.txt");
	writer.write(lapDet.getLaptopDetailsText());
	
	
	
}
catch(Exception e) {
	e.printStackTrace();
}
finally {
	try {
		fos.close();
		writer.close();
		session.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}

	}

}
