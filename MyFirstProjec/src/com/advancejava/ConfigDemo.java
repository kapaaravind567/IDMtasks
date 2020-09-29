package com.advancejava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String cnames="";
    public ConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		cnames = config.getInitParameter("cname");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<form action=ConfigDemo method=POST>");
		pw.println("<h1 style=background-color:navy;color:white;padding:20px></h1>");
		pw.println("<h1>Welcome to registration page</h1>");
		String cns[] = cnames.split(",");
		pw.println("<table align=center cellpadding = 20px border=1 >");
		pw.println("<tr><td>select course name :</td><td> ");
		pw.println("<select name = cname>");
		for(String x : cns) {
			pw.println("<option>"+x+"</option>");
		}
		pw.println("</select></td><tr><td colspan=2 align=center><input type=submit value=Register </td></tr>");
		pw.println("</table></form>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String cnames[] = {"JAVA",".NET","PYTHON","ORACLE"};
		double prices[] = {20000.00,15000.00,10000.00,8000.00};
		String cname = request.getParameter("cname");
		int ind=0;
		for ( int i = 0; i < cnames.length; i++) {
			if(cnames[i].equals(cname))
			{
				ind=i;
			}
		}
		pw.println("<h1 style=color:green>YOU HAVE DONE REGRISTRATION SUCCESSFULLY<br>");
		pw.println("Your selected course is" + cname + "<br>");
		pw.println("You need to pay Rs."+prices[ind]+ "only<br>");
		pw.println("Thank you</h1>");
	}

}
