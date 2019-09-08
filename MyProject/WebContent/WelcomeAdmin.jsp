<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Welcome Admin</title>
	<link rel="stylesheet" href="css/welcomeadmin.css">
</head>
<body>
	<%!	
		String data=null;
	%>
	<div align="center">
		<button><a href="ShowUsersServlet">Show all Users</a></button>
		<hr>
		<button><a href="AddCategory.jsp">Add Category</a></button><br>
		<button><a href="ShowCategoriesServlet">Manage Categories</a></button>
		<hr>
		<%
		data=(String)request.getAttribute("add");
		if(data!=null)
			out.print(data);
		%>
		<button><a href="AddProduct.jsp">Add Product</a></button><br>
		<button><a href="ShowProductsServlet">Manage Products</a></button>
	</div>
</body>
</html>