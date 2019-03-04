package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResetPassword implements Filter
{
	/* This is filter class which is called before servlet 
	 * in this method user name and password is fetch entered by user on web page and 
	 * passed to dao class to check details in database  
	 */
	@SuppressWarnings("unused")
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		Dao dao = new Dao();
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  	
	    //fetching data using http request
	    String name1=request.getParameter("naam");
	    String lname1=request.getParameter("lastnaam");
	    String user1=request.getParameter("usernaam");
	    String password1=request.getParameter("newPass"); 
	   
	    try {
			if(dao.checkDetails1(name1,lname1,user1,password1 ))		//check entered details is valid or not
			{ 												//if it is valid forward to user welcome page 
				HttpSession session = req.getSession();
				session.setAttribute("useName", name1);
			    RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");  
			    rd.forward(request, response);  
			}  
			
			else
			{   
				//if invalid data is entered user will remain on index page only
			    RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
			    rd.include(request, response);
			    out.print("Authentication Error"); 			                  
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}

