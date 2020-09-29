package com.advancejava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int firstno = Integer.parseInt(request.getParameter("firstno"));
		int secondno = Integer.parseInt(request.getParameter("secondno"));
		String value=request.getParameter("a");
		if(value.equals("add"))
		{
			pw.println("sum is "+(firstno+secondno));
		}
		if(value.equals("sub"))
		{
			pw.println("sub is "+(firstno-secondno));
		}
		if(value.equals("div"))
		{
			pw.println("div is "+(firstno/secondno));
		}
		if(value.equals("mul"))
		{
			pw.println("mul is "+(firstno*secondno));
		}
	}

}
