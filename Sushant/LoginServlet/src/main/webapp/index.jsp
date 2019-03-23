<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login and registration</title>
</head>
<h1 style="color: purple">Please login to procceed</h1>
<body style="margin-top: 80px; margin-left: 400px">
	<form action="servlet1" method="Post">
		<table width="400">
			<tr>
				<td style="color: Black "><h2 style="color: red; margin-left:40px">User
						Name</h2></td>
				<td><input type="text" name="user"
					style="width: 15px height: 2px"></td>
			</tr>
			<tr>
				<td style="color: Black"><h2 style="color: red;margin-left:40px">Password</h2></td>
				<td><input type="password" name="userPass"
					style="width: 15px height: 2px"></td>
			</tr>
			<tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"
					style="width: 15px height: 2px"></td>
			</tr>
		</table>
	</form>
	
	
	<form action="Register.jsp" method="post">
		<h5 style="color: blue; margin-left:180px"> OR new user??</h5>
		<table width="400">
			<td><input type="submit" value="Register here"
				style="width: 15px height: 2px; margin-left:180px"></td>
		</table>
	</form>
	
	<form action="setpassword.jsp" method="post">
		<h5 style="color: blue; margin-left:180px"><a href="setpassword.jsp">forgot password</a> </h5>
		<table width="400">
		</table>
	</form>
</body>
</html>