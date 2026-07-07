package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class firstUpdateUsingPreparedStatement {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		
			try {
				Scanner sc=new Scanner(System.in);
				connection=jdbcUtilCommonConnection.getConnection();
				String sqlQueryUpdate="UPDATE STUDENTDETAILS SET SAGE=?,SCITY=? WHERE SID=?";
				pstmt=connection.prepareStatement(sqlQueryUpdate);
				System.out.println("Please provide Info to Update the Details");
				System.out.println("Enter the Student Id : ");
				int id=sc.nextInt();
				System.out.println("Please provide the correct age to update : ");
				int age=sc.nextInt();
				System.out.println("Please provide the correct City to update : ");
				String city=sc.next();
				pstmt.setInt(1, age);
				pstmt.setString(2, city);
				pstmt.setInt(3, id);
				
			int rowInserted=pstmt.executeUpdate();
			if(rowInserted==0) {
				System.out.println("Unable to Update the records");
			}else {
				System.out.println("Records Updated Successfully");
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
			try {
				jdbcUtilCommonConnection.closeResources(connection, pstmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
	}

}
