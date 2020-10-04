

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Stud1
 */
@WebServlet("/Student")
public class Stud1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
	response.setContentType("text/html;charset=windows-1251");
    PrintWriter writer = response.getWriter();

    String name = request.getParameter("username");
    String age = request.getParameter("userage");
    String gender = request.getParameter("gender");
    String country = request.getParameter("group");
    String[] courses = request.getParameterValues("courses");
     
    try {
        writer.println("<p>Ім'я: " + name + "</p>");
        writer.println("<p>Вік: " + age + "</p>");
        writer.println("<p>Стать: " + gender + "</p>");
        writer.println("<p>Група: " + country + "</p>");
        writer.println("<h4>Курси</h4>");
        for(String course: courses)
            writer.println("<li>" + course + "</li>");
    } finally {
        writer.close();  
    }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    String path = "/forwardSer";
    ServletContext servletContext = getServletContext();
    RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
    requestDispatcher.forward(request, response);
	}

}
