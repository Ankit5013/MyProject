<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Update User</title>
	<link rel="stylesheet" href="css/signup.css">
</head>
<body>
	<%
		String mail=(String)session.getAttribute("email");
	%>
	<div>
    	<form action="UpdateUserServlet" method="post" autocomplete="off">
            <h1><u>Update Details</u></h1><br>
            <label style="font-size:30px"><b>Email:</b></label>
            <input type="email" name="umail" placeholder="Enter Email" style="border-style:none; color:blue; font-size:25px" readonly="readonly" value="<%out.print(mail); %>" required>
            <hr>
            <p><u>Fill the details to be updated:</u></p>
            <label class="fn"><b>First Name:</b></label>
            <input type="text" name="fname" placeholder="Enter First Name" class="fna" required>
            <label class="ln"><b>Last Name:</b></label>
            <input type="text" name="lname" placeholder="Enter Last Name" class="lna" required>
            <label class="con"><b>Contact No:</b></label>
            <input type="tel" name="con" placeholder="Enter Contact" class="cont" required>
            <label class="p"><b>Password:</b></label>
            <input type="text" name="upass" placeholder="Enter Password" class="pass" required>
            <input type="submit" value="Update" class="sub">
            <input type="reset" value="Cancel" class="res">
         </form>
    </div>
</body>
</html>