<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	
	<form action="AddProductServlet" method="post">
		<h1>Fill the Details:</h1>
		<table>
			<tr><td>Category ID: </td><td><input type="text" name="cid"></td></tr>
			<tr><td>Product ID: </td><td><input type="text" name=pid></td></tr>
			<tr><td>Name: </td><td><input type="text" name="name"></td></tr>
			<tr><td>Desc: </td><td><input type="text" name="desc"></td></tr>
			<tr><td>Price: </td><td><input type="text" name="price"></td></tr>
			<tr><td>Quantity: </td><td><input type="text" name="quant"></td></tr>
			<tr><td>URL: </td><td><input type="text" name="url"></td></tr>
			<tr><td><input type="submit" value="Add Product">
			<input type="reset" value="Reset"></td></tr>
			
		</table>
	</form>

</body>
</html>