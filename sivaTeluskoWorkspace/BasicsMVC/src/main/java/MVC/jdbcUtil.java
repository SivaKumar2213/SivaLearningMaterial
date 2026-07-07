package MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("exports")
	public static Connection getConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbclearnsql";
		String user="root";
		String password="Apoorva@2020";
		return DriverManager.getConnection(url, user, password);
	}

	@SuppressWarnings("exports")
	public static void closeResources(Connection connection,Statement statement) throws SQLException {
		statement.close();
		connection.close();
	}
}
