package MVC;
//JSP will converted into the servlet by web container in the webserver and then the .class will generated
//In JSP, implicit objects are predefined objects that the JSP container automatically creates for you.
//You can use them directly in JSP pages without creating or importing anything. 👍
public class JSPBasics {
//1️) JSP Declaration Tag <%! %>
	
//-->Purpose-->Declare variables,Declare methods and Becomes class-level code
  //JSP Code
	/*<%! 
	int count = 0;
	public int add(int a, int b) {
	    return a + b;
	}
	%>*/
//Converted Servlet
	/*public final class demo_jsp extends HttpJspBase {
	    int count = 0;
	    public int add(int a, int b) {
	        return a + b;
	    }
	    public void _jspService(HttpServletRequest request,
	                            HttpServletResponse response) {
	        // request handling
	    }
	}*/

//Interview point
  //1)Code is placed outside _jspService()
  //2)Variables are instance variables
  //3)Not thread-safe
	
//-----------------------------------------------------------------------------------------------------------------------------
	
//2)JSP Scriptlet Tag <% %>
//Purpose -- >Write Java logic (conditions, loops, calculations)

//JSP Code
/*<%
int a = 10;
int b = 20;
%>*/

//Converted Servlet--> jspService cannot be override
/*public void _jspService(HttpServletRequest request,
                        HttpServletResponse response) {

    int a = 10;
    int b = 20;
}*/
//Interview point
//1)Code goes inside _jspService()
//2)Local variables → ✔ thread-safe
	
//------------------------------------------------------------------------------------------------------------------------------------------------------
//3)JSP Expression Tag <%= %>
	//Purpose-->Print output to browser
//JSP
  //<%= a + b %>
//Converted Servlet
	//out.print(a + b);
//Golden rule
//<%= expression %>  →  out.print(expression);
	
//----------------------------------------------------------------------------------------------------------------------------------------
//4)JSP Directive Tag <%@ %>
//purpose -->Used to give instructions to the JSP container
	//4.1( Page Directive)
//JSP
	//<%@ page import="java.util.*" contentType="text/html" %>

//Converted Servlet
	/*import java.util.*;
	response.setContentType("text/html");*/
	
//Used for:
    //import,session,errorPage,isELIgnored
	
	//4.2(Include Directive (STATIC include))
//JSP
	//<%@ include file="header.jsp" %>
//Internal Conversion
	// header.jsp content is copied here
//Happens at translation time
	
	//4.3
//Taglib Directive
//JSP
	//<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
//Servlet Equivalent
	// Registers tag handler classes internally
//Enables JSTL tags
	
//-----------------------------------------------------------------------------------------------------------------------------
//5️  JSP Standard Action Tags <jsp:...>
   //5️.1️<jsp:useBean>
//JSP
	//<jsp:useBean id="user" class="com.app.User" scope="session"/>
//Converted Servlet
	/*User user = (User) session.getAttribute("user");
	if (user == null) {
	    user = new User();
	    session.setAttribute("user", user);
	}*/
//5️.2️ <jsp:setProperty>
 //JSP
	//<jsp:setProperty name="user" property="name" value="Siva"/>
//Converted Servlet
	//user.setName("Siva");
//5️.3️ <jsp:getProperty>
  //JSP
	//<jsp:getProperty name="user" property="name"/>
//Converted Servlet
	//out.print(user.getName());

//5️.4️ <jsp:include> (DYNAMIC include)
 //JSP
	//<jsp:include page="menu.jsp"/>
//Converted Servlet
	/*RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
	rd.include(request, response);*/
// Happens at runtime

//5️.5️ <jsp:forward>
// JSP
	//<jsp:forward page="home.jsp"/>
//Converted Servlet
	/*RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
	rd.forward(request, response);*/

//6️ )JSP Comments <%-- --%>
  //JSP
	//<%-- This is a JSP comment --%>
//Converted Servlet
	// Not included at all
//Removed at translation time

//7️)HTML in JSP
  //JSP
	//<h1>Hello</h1>
//Converted Servlet
	//out.write("<h1>Hello</h1>");
	
//------------------------------------------	------------------------------------------------------------------------------------------


//List Of Implicit Object
	//Implicit Object	           Type	                                    Purpose
//	1)request	               HttpServletRequest	                     Access client request data
//	2)response	               HttpServletResponse	                     Send response to client
//	3)session	               HttpSession	                             Maintain user session
//	4)application	           ServletContext	                         Share data across application
//	5)out	                   JspWriter	                             Write output to browser
//	6)pageContext	           PageContext	                             Access all JSP scopes
//	7)config	               ServletConfig	                         Get servlet config details
//	8)page	                   Object	                                 Refers to current JSP servlet
//	9)exception	               Throwable	                             Handle errors (error pages only)











}

