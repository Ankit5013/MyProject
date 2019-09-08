<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="css/showcategories.css">
</head>
<body>
	<div align="center">
	<form>
		<h1>Categories List</h1>
		<table>
			<thead>
				<tr><th>Category ID</th>
				<th>Name</th>
				</thead>
			<tbody>
				<c:forEach items="${cat}" var="Category">
					<tr class="row"><td>${Category.categoryId}</td>
					<td>${Category.name}</td>
					<td><input type="submit" value="Delete" formaction="DeleteCategoryServlet"></td></tr>
				
				</c:forEach>
			</tbody>
		</table>
	</form>
	</div>
</body>
</html>