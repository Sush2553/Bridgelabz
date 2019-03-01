<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>

<body style="margin-top: 4em; margin-left: 60em;">
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
	<form action="logout" method="post">
		<table>
			<td><input type="submit" value="Logout"
				style="width: 18em; height: 2em;"></td>
		</table>
	</form>
</body>
</html>