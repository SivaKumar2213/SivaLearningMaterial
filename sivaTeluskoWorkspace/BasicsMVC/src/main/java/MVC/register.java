package MVC;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/register")
public class register extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name=request.getParameter("uname");
	String email=request.getParameter("uemail");
	String password=request.getParameter("upass");
	String city=request.getParameter("ucity");
	int mobileNumber=Integer.parseInt(request.getParameter("umobile"));
	
	Model model=new Model();
	model.setName(name);
	model.setEmail(email);
	model.setMobileNumber(mobileNumber);
	model.setPassword(password);
	model.setCity(city);
	int count=model.register();
HttpSession session=request.getSession();
	if(count==0) {
		session.setAttribute("message", "Sorry,"+name+" your Registration Failed!");
		response.sendRedirect("failure.jsp");
	}else {
		session.setAttribute("message", "Congrats,"+name+" you have successfully Resgistered the details!");
		response.sendRedirect("success.jsp");
	}
	}

}
