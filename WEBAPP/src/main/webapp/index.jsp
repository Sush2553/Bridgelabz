<%page language="java"; contentType="text/html; charset=UTF-8";
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome To BridgeLabz</title>
</head>
<style>
         body {
            background-image: url("http://backgroundcheckall.com/wp-content/uploads/2017/12/windows-10-login-screen-background.jpg");
            background-repeat: no-repeat;  
			background-size: 1300px 700px;   
         }
      </style>
<h1 style="color:Black;">Welcome To BridgeLabz</h1>
<body style=margin-top:12em;margin-left:25em;margin-right:5;>
	<form action="servlet1" method="Post">
		<table  width="350">
			<tr>
				<td style="color:Black"><h2 style="color:Black;">User Name</h2></td>
				<td><input type="text" name="userName" style = " width: 15em;  height: 2em;"></td>
			</tr>
			<tr>
				<td style="color:Black"><h2 style="color:Black;">Password</h2></td>
				<td><input type="password" name="userPass" style = " width: 15em;  height: 2em;"></td>
			</tr>
			<tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" style = " width: 15em;  height: 2em;"></td>
			</tr>
		</table>
	</form>	
	<form action ="Register.jsp" method = "post">
	<table style = margin-left:7.8em; width="350">
		<td><input type ="submit" value = "Register" style = " width: 15em;  height: 2em;" ></td>	
	</table>
	</form>
</body>
</html>