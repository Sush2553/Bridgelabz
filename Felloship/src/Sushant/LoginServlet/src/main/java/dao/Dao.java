package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dao {
	/**This method is to verify from database whether entered user details is valid or not 
	 * @param uname is user name entered by user
	 * @param password is user entered password 
	 * @return boolean value whether entered details is correct or not from database 
	 * @throws Exception
	 */
	public boolean checkDetails(String uname,String password)throws Exception
	{
		//SQL query to verify user details in database
		String query="select * from WebApp.registerData where userName=? and password=? ";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/login","root","Sush@2553");
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,uname);
		statement.setString(2,password);
		ResultSet set = statement.executeQuery();
		//condition to check is that user name and password is available in database or not
		if(set.next())
		{
			return true;    //return true when entered details is correct
		}
		statement.close();
		con.close();
		return false;		
	}

	public boolean checkDetails1(String name1, String lname1, String user1, String password1) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String query="select * from WebApp.registerData where fname=? and lname=? and userName=?";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/login","root","Sush@2553");
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,name1);
		statement.setString(2,lname1);
		statement.setString(3,user1);
		ResultSet set = statement.executeQuery();
		//condition to check is that user name and password is available in database or not
		if(set.next())
		{
		String query1="UPDATE WebApp.registerData SET password = ? where fname=? and lname=? and userName=?";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/login","root","Sush@2553");
		PreparedStatement statement1 = con.prepareStatement(query1);
		statement1.setString(1,password1);
		statement1.setString(2,name1);
		statement1.setString(3,lname1);
		statement1.setString(4,user1);
		statement1.executeUpdate();
		System.out.println("password updated");
		
			return true;    //return true when entered details is correct
		}
		statement.close();
		con.close();
		return false;
	}
}
