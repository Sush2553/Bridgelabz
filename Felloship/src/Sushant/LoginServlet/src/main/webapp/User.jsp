<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body style="margin-top: 8em; margin-left: 30em;">
	<%
		Cookie cookie[] = request.getCookies();
		PrintWriter writer = response.getWriter();
		if (cookie != null) {
			for (int i = 0; i < cookie.length; i++) {
				String name = cookie[i].getName();
				String value = cookie[i].getValue();
				response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");//for back button after logout	
				if (session.getAttribute("uname") == null) {
					RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
					rd.forward(request, response);
				}
			}
		} else
			writer.print("session expired..!!!");
	%>

</body>
<form action="logout" method="post">
	<table>
		<h1 style="color: Black;">Welcome ${uname}</h1>
		<td><input type="submit" value="Logout"
			style="width: 18em; height: 2em;"></td>
	</table>
</form>
</html>