

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetServlet
 */
@WebServlet("/set")
public class SetCookServlet extends HttpServlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
		 
		 response.setContentType("text/html;charset=windows-1251");
	        PrintWriter out = response.getWriter();
	        try {
	            response.addCookie(new Cookie("user", "Vlad"));
	            out.println("<h2>Кукі встановлено!<h2>");
	        }
	        finally {
	            out.close();
	        }
	    }
}
