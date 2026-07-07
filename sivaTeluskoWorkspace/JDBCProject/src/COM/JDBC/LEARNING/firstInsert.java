package COM.JDBC.LEARNING;
import java.sql.*;
public class firstInsert {

	public static void main(String[] args) {
try {
	//Load and register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");//is used to load the class Driver(Refer useOfClassForNameInJava program)
	                                          //while loading the class it will execute the static block
	                                          //in static block of driver class,we are registering the driver
	                                          //we will have the code to register the driver which is line 12
	//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	                                          //Line number 8 and 12 does the same one to register driver
	                                          //Because Driver is a class ,which has been developed by MySql Team
	                                          //In driver class we has static ,where line no 12 is present 
	                                          //so if we load the class automatically it will execute the d=static block
	                                          
	
	String url="jdbc:mysql://localhost:3306/jdbclearnsql";
	String user="root";
	String password="Apoorva@2020";
	//to establish the connection to the database
	Connection connection=DriverManager.getConnection(url, user, password);
	//Create a statement
	Statement statement=connection.createStatement();
	String sqlQueryInsert="INSERT INTO STUDENTDETAILS(SID,SNAME,SAGE,SCITY,SMOBILENUMBER) VALUES (7,'LOTT',17,'SALEM',9091)";
	int rowInserted=statement.executeUpdate(sqlQueryInsert);
	if(rowInserted==0) {
		System.out.println("Unable to insert the records");
	}else {
		System.out.println("Records Inserted Successfully");
	}
	statement.close();
	connection.close();
} catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
