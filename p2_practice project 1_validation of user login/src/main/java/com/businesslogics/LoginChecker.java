package com.businesslogics;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(asyncSupported = true, urlPatterns = { "/LoginChecker" })
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginChecker() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String uname=request.getParameter("txtuname");
//		String pword=request.getParameter("txtpassword");
//		PrintWriter out=response.getWriter();
//		if(uname.equalsIgnoreCase("java") && pword.equals("eclipse123")){
//			out.println("You are Welcomed");
//		}
//		else
//			out.println("Invalid Username or Password");
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("txtuname");
		String pword=request.getParameter("txtpassword");
		PrintWriter out=response.getWriter();
		//RequestDispatcher- an interface to include content on same page or different pages
		RequestDispatcher rd;
		if(uname.equalsIgnoreCase("java") && pword.equals("eclipse123")){
			
			//session object is created bby web conatiner and generate sessionid
			HttpSession session=request.getSession(true);//create a new object and store its reference in session object
			session.setAttribute("username", uname);
			
			
			rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}
		else {
			out.println("Invalid Username or Password");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}
	

}
