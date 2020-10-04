

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/sess")
public class SessionServlet extends HttpServlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	         
		 response.setContentType("text/html;charset=windows-1251");
	        HttpSession session = request.getSession();
	        
	        String name = (String) session.getAttribute("name");
	         
	        PrintWriter out = response.getWriter();
	        try {
	            
	            if(name == null) {
	                
	                session.setAttribute("name", "Vlad Vladovich");
	                out.println("Дані сесії встановлені!");
	            }
	            else {
	                out.println("Ім'я" + name);
	               
	                session.removeAttribute("name");
	            }
	        }
	        finally {
	            out.close();
	        }
	    }

}
