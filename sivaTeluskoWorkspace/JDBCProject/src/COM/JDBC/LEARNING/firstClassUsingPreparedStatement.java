package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class firstClassUsingPreparedStatement {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
			try {
				Scanner sc=new Scanner(System.in);
				connection=jdbcUtilCommonConnection.getConnection();
				String sqlQueryUpdate="SELECT * FROM STUDENTDETAILS WHERE SID=?";
				pstmt=connection.prepareStatement(sqlQueryUpdate);
				System.out.println("Please provide Info to Retrieve the Student Details");
				System.out.println("Enter the Student Id : ");
				int id=sc.nextInt();
				pstmt.setInt(1, id);
				rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString(4)+" "+rs.getInt(5));
			}else {
				System.out.println("There is no records found against student id : "+id);
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
			try {
				jdbcUtilCommonConnection.closeResources(connection, pstmt);
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
	}

}
