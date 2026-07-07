package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//BtachUpdate --> will work only for non select statements(Insert,update and delete)
public class batchUpdate {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		
			try {
				Scanner sc=new Scanner(System.in);
				connection=jdbcUtilCommonConnection.getConnection();
				String sqlQueryUpdate="UPDATE STUDENTDETAILS SET SAGE=? WHERE SID=?";
				pstmt=connection.prepareStatement(sqlQueryUpdate);
				pstmt.setInt(1, 12);
				pstmt.setInt(2, 1);
				pstmt.addBatch();
				pstmt.setInt(1, 14);
				pstmt.setInt(2, 2);
				pstmt.addBatch();
				pstmt.setInt(1, 16);
				pstmt.setInt(2, 3);
				pstmt.addBatch();
				pstmt.setInt(1, 50);
				pstmt.setInt(2, 9);
				pstmt.addBatch();
			pstmt.executeBatch();
				System.out.println("Check The DB to see the updated details");
			
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
