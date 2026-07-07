package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class firstSelect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbclearnsql";
			String user="root";
			String password="Apoorva@2020";
			Connection connection=DriverManager.getConnection(url, user, password);
			Statement statement=connection.createStatement();
			String sqlQuerySelect="SELECT * FROM STUDENTDETAILS";
			ResultSet rs=statement.executeQuery(sqlQuerySelect);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString(4)+" "+rs.getInt(5));
			}
			statement.close();
			connection.close();
			rs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
