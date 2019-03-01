package com.java;

public class Dao {
	/**This method is to verify from database whether entered user details is valid or not 
	 * @param uname is user name entered by user
	 * @param password is user entered password 
	 * @param role is to check entered user is admin or normal user 
	 * @return boolean value whether entered details is correct or not from database 
	 * @throws Exception
	 */
	public boolean checkDetails(String uname,String password,String role)throws Exception
	{
		//SQL query to verify user details in database
		String query="select * from registerData where userName=? and password=? and Role=?";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://root@127.0.0.1::/var/run/mysqld/mysqld.sock/login","root","Sush@2553");
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,uname);
		statement.setString(2,password);
		statement.setString(3,role);
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
}
