

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//In Java, if a class extends HttpServlet or implements the Servlet interface,
//it is called a Servlet.
//Whenever a request is sent from the client (browser),
//the request reaches the web server where the application is deployed.
//The web container then identifies and invokes the corresponding servlet.
//
//Servlet Lifecycle:
//1) Servlet class is loaded into memory (static block executes).
//2) Servlet object is instantiated (constructor executes).
//3) init() method is executed by the container.
// (static block, constructor, and init() are executed ONLY ONCE)
//
//4) For every client request, the service() method is invoked.
// Internally, service() delegates the request to doGet(), doPost(), etc.
//5) destroy() method is executed ONLY ONCE when the server is stopped
// or the application is undeployed.
//NOTE:
//When overriding init(ServletConfig config), we must call super.init(config) or @Override annotation.
//This is required because the parent class stores the ServletConfig reference
//internally. If we do not call super.init(config), getServletConfig() will
//return null, leading to NullPointerException.
//
//ServletConfig contains:
//- Servlet name
//- Initialization parameters (<init-param>)
//- Reference to ServletContext
//
//Example usage:
//getServletConfig().getServletName();
//getServletConfig().getInitParameter("dbUser");

//One line Interviewer answer for , why we should call super.init(config) or @Override annotation for servlet methods like init
//Receiving and saving your ID card before entering a company,If you receive the ID 
//but don’t store it, later security checks will fail.

@WebServlet("/servletLifeCycle")
public class servletLifeCycle extends HttpServlet {
static {
	System.out.println("Servlet Loaded ..............................");
}

	public servletLifeCycle() {
		System.out.println("Servlet object created by web container");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Initiated");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet service method executed to get the request and response back");
	}
	public void destroy() {
	}

}
