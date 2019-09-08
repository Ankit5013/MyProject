<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
    <head>
        <title>LogIn</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
        <div>
            <form action="AdminLoginController" method="post" autocomplete="off">  
                <h1><u>ADMIN LOGIN</u></h1>
                <label class="em"><b>Email:</b></label>
                <input type="email" name="umail" class="mail" placeholder="Enter Email" required>
                <label class="p"><b>Password:</b></label>
                <input type="password" name="upass" class="pass" placeholder="Enter Password" required>
                <input type="submit" value="Log In" class="button"/>
            </form>
        </div>
        
    </body>
</html>
