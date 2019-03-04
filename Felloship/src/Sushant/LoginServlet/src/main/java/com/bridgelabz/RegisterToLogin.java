package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterToLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterToLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method fetch data entered by user on register.jsp page and save it into
	 * database.this method create connection with database and perform operation on
	 * it.
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	int count = 0;
	String query = "insert into WebApp.registerData(fName,lName,email,userName,password)values(?,?,?,?,?)";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/login", "root",
					"Sush@2553");
			PreparedStatement statement = connection.prepareStatement(query);
			// fetching data from web page
			String fName = request.getParameter("firstname");
			String lName = request.getParameter("lastname");
			String email = request.getParameter("emailid");
			String userName = request.getParameter("uname");
			String password = request.getParameter("password");
			// inserting data in databse
			statement.setString(1, fName);
			statement.setString(2, lName);
			statement.setString(3, email);
			statement.setString(4, userName);
			statement.setString(5, password);
			count = statement.executeUpdate();
			System.out.println(count + " rows affected");
			statement.close();
			connection.close();
			response.sendRedirect("index.jsp"); // after registration this method will redirect you to index page
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}