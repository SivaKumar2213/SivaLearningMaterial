package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class firstDelete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbclearnsql";
			String user="root";
			String password="Apoorva@2020";
			Connection connection=DriverManager.getConnection(url, user, password);
			Statement statement=connection.createStatement();
			String sqlQueryDelete="DELETE FROM STUDENTDETAILS WHERE SID=4";
			int rowDeleted=statement.executeUpdate(sqlQueryDelete);
			if(rowDeleted==0) {
				System.out.println("Unable to Delete the records");
			}else {
				System.out.println("Record Deleted Successfully");
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
