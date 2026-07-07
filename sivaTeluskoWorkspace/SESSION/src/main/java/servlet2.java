

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Welcome to servlet 2");
	HttpSession session=request.getSession();
	String name=(String)session.getAttribute("name");
	System.out.println("Name from the second servlet : "+name);
	
	PrintWriter writer = response.getWriter();
	writer.write("<h1> Response from the second Servlet</h1> "+"<h1>"+name+"</h1>");
	
	}

}
