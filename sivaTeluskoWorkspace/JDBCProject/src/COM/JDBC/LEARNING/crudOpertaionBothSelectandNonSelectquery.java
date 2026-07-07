package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//execute can perform CRUD operation
//CRUD stands for-->C-->CREATE(INSERT),R-->READ,U-->UPDATE,D-->DELETE
//We are having one method execute,If we pass select query returns true
//if we pass non select query like(Insert,update,delete) returns false
//hence based on the return value we are process the remaining logic
public class crudOpertaionBothSelectandNonSelectquery {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbclearnsql";
			String user="root";
			String password="Apoorva@2020";
			Connection connection=DriverManager.getConnection(url, user, password);
			Statement statement=connection.createStatement();
			ResultSet rs = null;
			//String sqlQuery="SELECT * FROM STUDENTDETAILS";
			String sqlQuery="UPDATE STUDENTDETAILS SET SMOBILENUMBER=9094 WHERE SMOBILENUMBER=9095";
			boolean status=statement.execute(sqlQuery);
			if(status) {
				 rs=statement.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString(4)+" "+rs.getInt(5));
			}
			}else {
				int count=statement.getUpdateCount();
				if(count==0) {
					System.out.println("Operation Failed");
				}else {
					System.out.println("Operation Successfully");
				}
			}
			statement.close();
			connection.close();
			if(rs!=null)
			rs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
