package com.advancejava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextDemo
 */
public class ContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ServletContext ctx = null;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ctx = config.getServletContext();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String drivername = ctx.getInitParameter("drivername");
		String url = ctx.getInitParameter("url");
		String username = ctx.getInitParameter("username");
		String password = ctx.getInitParameter("password");
		pw.println("<h1 style=color:navy>");
		String res ="Drivername ="+drivername+"<br>";
			   res +="url ="+url+"<br>";
			   res +="username ="+username+"<br>";
			   res +="password ="+password+"<br>";
		pw.println(res +"</h1>");
	}

}
