<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<h1 style="color: Cyan">Please provide following details</h1>
<body style="margin-top: 7em; margin-left: 22em;">

	<form action="regLogin" method="post">
		<table>
			<tr>
				<td><h3 style="color: black; margin-left: 2em">Enter First
						Name</h3></td>
				<td><input type="text" name="firstname"
					style="width: 15em; height: 1.5em;" required></td>
			</tr>
			<tr>
				<td><h3 style="color: black; margin-left: 2em">Enter Last
						Name</h3></td>
				<td><input type="text" name="lastname"
					style="width: 15em; height: 1.5em;" required></td>
			</tr>
			<tr>
				<td><h3 style="color: black; margin-left: 2em">Enter Email
						ID</h3></td>
				<td><input type="text" name="emailid"
					style="width: 15em; height: 1.5em;"></td>
			</tr>
			<tr>
				<td><h3 style="color: black; margin-left: 2em">Enter User
						Name</h3></td>
				<td><input type="text" name="uname"
					style="width: 15em; height: 1.5em;"></td>
			</tr>
			<tr>
				<td><h3 style="color: black; margin-left: 2em">Enter
						Password</h3></td>
				<td><input type="password" name="password"
					pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})"
					title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
					required style="width: 15em; height: 2em;"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"
					style="width: 5em; height: 2em;"></td>
			</tr>
		</table>
	</form>
</body>