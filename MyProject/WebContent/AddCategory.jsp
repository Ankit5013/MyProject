<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Category</title>
</head>
<body>
	<form action="AddCategoryServlet" method="post">
		<table>
			<tr><td>Category ID: </td><td><input type="text" name="id"></td></tr>
			<tr><td>Category Name: </td><td><input type="text" name="name"></td></tr>
			<tr><td><input type="submit" value="Add Category">
			<input type="reset" value="Cancel"></td></td>
		</table>
	</form>

</body>
</html>