

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 import COM.JDBC.LEARNING.jdbcUtilCommonConnection;;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Control In Servlet");
String name=request.getParameter("uname");
String email=request.getParameter("uemail");
int mobileNumber=Integer.parseInt(request.getParameter("umobile"));
String password=request.getParameter("upasswrod");
String city=request.getParameter("ucity");

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/jdbclearnsql";
	String user="root";
	String Conpassword="Apoorva@2020";
	Connection connection=DriverManager.getConnection(url, user, Conpassword);
	String sqlQueryInsert="INSERT INTO REGISTERUSERDTAILS(NAME,EMAIL,MOBILE,PASSWORD,CITY) VALUES (?,?,?,?,?)";
	PreparedStatement pstmt = connection.prepareStatement(sqlQueryInsert);
	pstmt.setString(1, name);
	pstmt.setString(2, email);
	pstmt.setInt(3, mobileNumber);
	pstmt.setString(4, password);
	pstmt.setString(5, city);
	
	PrintWriter writer = response.getWriter();
int rowInserted=pstmt.executeUpdate();
if(rowInserted!=0) {
writer.println("<h1> Registriation Successfully Completed <h1/>");
}else {
	writer.println("<h1> Registriation Failed <h1/>");
}


}catch(Exception e) {
	
}
	
	}

}
