<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
    <head>
        <title>MyProject</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
        <%!
        	String msg=null;
        %>
        <%
        	msg=(String)request.getAttribute("del");
        	if(msg!=null)
        		out.println(msg);
        %>
        <div>
            <form action="LoginController" method="post">  
                <h1><u>USER LOGIN</u></h1>
                <label class="em"><b>Email:</b></label>
                <input type="email" name="umail" class="mail" placeholder="Enter Email" required>
                <label class="p"><b>Password:</b></label>
                <input type="password" name="upass" class="pass" placeholder="Enter Password" required>
                <input type="submit" value="Log In" class="button"/>
                <%
            		msg=(String)request.getAttribute("true");
            		if(msg!=null)
            	{
            		out.println(msg);
            	}
                %>
                <input type="button" onclick="location.href='AdminLogin.jsp';" value="Login as Admin" class="sign"/><br/>
                <p>New User? <span><a href="Signup.jsp">Sign Up</a></span></p>
            </form>
        </div>
        
    </body>
</html>
