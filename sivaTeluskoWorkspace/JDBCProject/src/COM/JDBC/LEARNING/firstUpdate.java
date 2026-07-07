package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class firstUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbclearnsql";
			String user="root";
			String password="Apoorva@2020";
			Connection connection=DriverManager.getConnection(url, user, password);
			Statement statement=connection.createStatement();
			String sqlQueryUpdate="UPDATE STUDENTDETAILS SET SAGE=11 WHERE SID=3";
			int rowUpdated=statement.executeUpdate(sqlQueryUpdate);
			if(rowUpdated==0) {
				System.out.println("Unable to Update the records");
			}else {
				System.out.println("Updated Successfully");
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


