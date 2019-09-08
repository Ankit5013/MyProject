<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Welcome</title>
	<link rel="stylesheet" href="css/welcomeuser.css">
</head>
<body>
	<%!
        String msg=null;
    %>
	<%
      	msg=(String)request.getAttribute("upd");
       	if(msg!=null)
       	{
       		out.println(msg);
        }
     %>
	<div class="dropdown">
		<button class="dropbtn">
		<%
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
			String name=(String)session.getAttribute("username");
			if(name==null)
			{
				response.sendRedirect("index.jsp");	
			}
			else{
			out.println("Welcome "+name);
			}
		%>
		</button>
		<div class="dropdown-content">
			<a href="UpdateUser.jsp">Update Details</a>
			<a href="DeleteUser.jsp">Delete My Account</a>
			<a href="LogoutController">Log Out</a>
		</div>
	</div>
	<div class="img">
		<c:forEach items="${pro}" var="Product">
		<img style="width:500px;height:500px;" src="${Product.url}"></img>
		</c:forEach>
	</div>
</body>
</html>