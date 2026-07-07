// RequestDispatcher is used to transfer a request to another servlet
// There are two methods: forward() and include()

// IMPORTANT:
// forward() does NOT stop Java execution
// It only transfers HTTP response responsibility
// Java code continues after forward(), that’s why logs are printed

// FLOW:

// forward():
// Client Browser -> First Servlet -> Second Servlet -> Response to Client
// (Only Second Servlet response is shown in browser)

// include():
// Client Browser -> First Servlet -> Second Servlet
// -> Response comes back to First Servlet
// -> Combined response sent to Client

// GOLDEN INTERVIEW LINE:
// forward() and include() control HTTP response, NOT Java execution

// Because of this:
// - Logs (System.out.println) will print even after forward()
// - Browser response will NOT print after forward()

// RESPONSE COMMIT RULE:
// Once response is committed:
// - You cannot write more output
// - You cannot forward
// - Any output is silently ignored

// RESPONSE IS COMMITTED BY:
// 1) out.close()
// 2) out.flush()
// 3) response.sendRedirect()
// 4) RequestDispatcher.forward()
// 5) Response buffer becomes full

// VERY IMPORTANT RULE:
// NEVER close PrintWriter in servlets
// ❌ out.close();
// ✔ Let the servlet container close it automatically


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control In FirstServlet - START");

        PrintWriter out = response.getWriter();
        out.println("<h3>Browser: FirstServlet - Before Dispatcher</h3>");

        // 🔁 CHANGE HERE: forward() OR include()
        RequestDispatcher rd = request.getRequestDispatcher("secondServlet");
        rd.include(request, response);   // try include() also

        System.out.println("Control In FirstServlet - AFTER Dispatcher");

        out.println("<h3>Browser: FirstServlet - After Dispatcher</h3>");

        System.out.println("End of FirstServlet");
        out.close();
	}

}
