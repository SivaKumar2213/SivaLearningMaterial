

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@SuppressWarnings("serial")
@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
   
	public FirstServlet() {
		System.out.println("The Servlet object is created internally by container");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	             String name= request.getParameter("uname");
	             String city= request.getParameter("ucity");
	             
	             response.setContentType("text/html");
	             PrintWriter out = response.getWriter();

	             out.println("<html>");
	             out.println("<head>");
	             out.println("<title>Welcome Page</title>");

	             // CSS starts here
	             out.println("<style>");
	             out.println("body { background-color: #e0f7fa; font-family: Arial; text-align: center; }");
	             out.println("h1 { color: #006064; }");
	             out.println(".card { background: white; width: 400px; margin: 100px auto; padding: 20px; "
	                     + "border-radius: 10px; box-shadow: 0 4px 10px rgba(0,0,0,0.2); }");
	             out.println("</style>");
	             // CSS ends here

	             out.println("</head>");
	             out.println("<body>");

	             out.println("<div class='card'>");
	             out.println("<h1>Hello " + name + " 👋</h1>");
	             out.println("<h2>You are coming from " + city + "</h2>");
	             out.println("</div>");

	             out.println("</body>");
	             out.println("</html>");
	           
	
	}

}
