// Session is created by the servlet container (web server) for a user
// when the first request comes (not strictly only on login).
// If you set a value in session, it will be available
// across multiple requests for that user until the session expires or is invalidated.
//Key points to remember 
//Session is per user, not per application.
//Session is created on first request (or when request.getSession() is called),not automatically only on login.
//Data stored in session:
//Available across multiple servlets/JSPs
//Available across multiple requests
//But only for that particular user

//Session ends when:
//Timeout happens
//session.invalidate() is called
//Browser is closed (depends on config)

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("uname");
	String password=request.getParameter("upass");
	System.out.println("Username :"+name);
	HttpSession session=request.getSession();
	session.setAttribute("name", name);
	RequestDispatcher rd=request.getRequestDispatcher("servlet2");
	rd.forward(request, response);
	}

}
