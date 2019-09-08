<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>List of Users</title>
	<link rel="stylesheet" href="css/showusers.css">
</head>
<body>
	<div align="center">
	<form>
		<h1>Users List</h1>
		<table>
			<thead>
				<tr><th>FirstName</th>
				<th>LastName</th>
				<th>Contact</th>
				<th>Email</th>
				<th>Password</th></tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="User">
					<tr class="row"><td>${User.firstname}</td>
					<td>${User.lastname}</td>
					<td>${User.contact}</td>
					<td>${User.email}</td>
					<td>${User.password}</td></tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
	</div>
</body>
</html>