package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHello extends javax.servlet.http.HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html><body>");
	out.println("<h1> Hola " + request.getParameter("nombre")+" </h1>");
	out.print(" </body></html>");
	out.close();
	}

}
