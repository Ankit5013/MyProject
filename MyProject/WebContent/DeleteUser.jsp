<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete User</title>
</head>
<body>
	<%
		String mail=(String)session.getAttribute("email");
	%>
	<form action="DeleteUserServlet" method="post" autocomplete="off">
		<h3>Enter your email and password to continue:</h3>
		<table>
		<tr><td style="font-size:20px">Email: </td> 
		<td><input type="email" name="umail" readonly="readonly" value="<%out.print(mail); %>" style="border-style:none; font-size:20px"></td></tr>
		<tr><td style="font-size:20px">Password: </td>
		<td><input type="password" name="upass"></td></tr>
		</table><br>
		<input type="submit" value="Delete" style="margin-left:20px">
		<input type="button" onclick="location.href='WelcomeUser.jsp';" value="Back">
	</form>
</body>
</html>