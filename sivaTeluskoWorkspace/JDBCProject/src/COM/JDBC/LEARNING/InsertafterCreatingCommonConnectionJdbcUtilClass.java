package COM.JDBC.LEARNING;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertafterCreatingCommonConnectionJdbcUtilClass {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		
			try {
				connection=jdbcUtilCommonConnection.getConnection();
			    statement=connection.createStatement();
			    String sqlQueryInsert="INSERT INTO STUDENTDETAILS(SID,SNAME,SAGE,SCITY,SMOBILENUMBER) VALUES (9,'WIN',13,'SALEM',1333)";
			int rowInserted=statement.executeUpdate(sqlQueryInsert);
			if(rowInserted==0) {
				System.out.println("Unable to insert the records");
			}else {
				System.out.println("Records Inserted Successfully");
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
			try {
				jdbcUtilCommonConnection.closeResources(connection, statement);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
	}
}
		
	


