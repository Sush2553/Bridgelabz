<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>set password</title>
</head>
<h1 style="color: purple">Please login to procceed</h1>
<body style="margin-top: 80px; margin-left: 400px">
	<form action="servlet1" method="Post">
		<table width="400">
		<tr>
				<td style="color: Black "><h2 style="color: red; margin-left:40px">First
						Name</h2></td>
				<td><input type="text" name="naam"
					style="width: 15px height: 2px"></td>
			</tr>
			<tr>
				<td style="color: Black"><h2 style="color: red;margin-left:40px">Last Name</h2></td>
				<td><input type="password" name="lastnaam"
					style="width: 15px height: 2px"></td>
			</tr>
			<tr>
				<td style="color: Black "><h2 style="color: red; margin-left:40px">User
						Name</h2></td>
				<td><input type="text" name="usernaam"
					style="width: 15px height: 2px"></td>
			</tr>
		<tr>
				<td style="color: Black"><h2 style="color: red;margin-left:40px">New Password</h2></td>
				<td><input type="password" name="newpass"
					style="width: 15px height: 2px"></td>
			</tr>
		
			<tr>
				<td></td>
				<td><input type="submit" value="submit"
					style="width: 15px height: 2px"></td>
			</tr>
		</table>
	</form>
	</body>
	</html>