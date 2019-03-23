package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao;

public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * This is filter class which is called before servlet in this method user name
	 * and password is fetch entered by user on web page and passed to dao class to
	 * check details in database
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		Dao dao = new Dao();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// fetching data using http request
		String name1 = request.getParameter("naam");
		String lname1 = request.getParameter("lastnaam");
		String user1 = request.getParameter("usernaam");
		String password1 = request.getParameter("newpass");

		try {
			if (dao.checkDetails1(name1, lname1, user1, password1)) // check entered details is valid or not
			{ // if it is valid forward to user welcome page
				out.print("Password updated successfully");
			}

			else {

				out.print("please ensure your details");
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
