package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class firstDeleteUsingPreparedStatement {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		
			try {
				Scanner sc=new Scanner(System.in);
				connection=jdbcUtilCommonConnection.getConnection();
				String sqlQueryUpdate="DELETE FROM STUDENTDETAILS WHERE SID=?";
				pstmt=connection.prepareStatement(sqlQueryUpdate);
				System.out.println("Please provide Info to Delete the Student Details");
				System.out.println("Enter the Student Id : ");
				int id=sc.nextInt();
				pstmt.setInt(1, id);
				
			int rowInserted=pstmt.executeUpdate();
			if(rowInserted==0) {
				System.out.println("Unable to Delete the records");
			}else {
				System.out.println("Records Deleted Successfully");
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
