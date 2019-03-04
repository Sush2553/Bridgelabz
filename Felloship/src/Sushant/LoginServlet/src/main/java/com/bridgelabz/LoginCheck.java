package com.bridgelabz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginCheck extends HttpServlet
{
	/* This method is call when clicked user on login button
	 * (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException
	{
		response.setContentType("text/jsp");   //it just show that response is in which format
}
}
