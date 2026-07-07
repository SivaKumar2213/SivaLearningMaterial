package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class firstInsertUsingPreparedStatement {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		
			try {
				connection=jdbcUtilCommonConnection.getConnection();
				String sqlQueryInsert="INSERT INTO STUDENTDETAILS(SID,SNAME,SAGE,SCITY,SMOBILENUMBER) VALUES (?,?,?,?,?)";
				pstmt=connection.prepareStatement(sqlQueryInsert);
				pstmt.setInt(1, 13);
				pstmt.setString(2, "Kumar");
				pstmt.setInt(3, 36);
				pstmt.setString(4, "Coimbatore");
				pstmt.setInt(5, 3637);
			int rowInserted=pstmt.executeUpdate();
			if(rowInserted==0) {
				System.out.println("Unable to insert the records");
			}else {
				System.out.println("Records Inserted Successfully");
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
