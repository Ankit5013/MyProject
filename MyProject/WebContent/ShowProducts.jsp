<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>List of Products</title>
	<link rel="stylesheet" href="css/showproducts.css">
</head>
<body>
	<%!	
		String data=null;
	%>
	<%
		data=(String)request.getAttribute("upd");
		if(data!=null)
			out.print(data);
	%>
	<div align="center">
	<form>
		<h1>Products List</h1>
		<table>
			<thead>
				<tr><th>Category ID</th>
				<th>Product ID</th>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>URL</th></tr>
			</thead>
			<tbody>
				<c:forEach items="${pro}" var="Product">
					<tr class="row"><td>${Product.categoryId}</td>
					<td>${Product.productId}</td>
					<td>${Product.name}</td>
					<td>${Product.description}</td>
					<td>${Product.price}</td>
					<td>${Product.quantity}</td>
					<td><img style="width:100px;height:100px;" src="${Product.url}"></img></td>
					<td><input type="button" value="Update" onclick="location.href='UpdateProduct.jsp';"></td>
					<td><input type="submit" value="Delete" formaction="DeleteProductServlet"></td></tr>
				
				</c:forEach>
			</tbody>
		</table>
	</form>
	</div>
</body>
</html>