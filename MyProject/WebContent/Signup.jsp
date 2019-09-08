<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>Register</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/signup.css">
    </head>
    <body>
        <div>
            <form action="SignupController" method="post" autocomplete="off">
            <h1><u>REGISTRATION FORM</u></h1>
            <p>Please fill in this form to create an account...</p>
            <hr>
            <label class="fn"><b>First Name:</b></label>
            <input type="text" name="fname" placeholder="Enter First Name" class="fna" required>
            <label class="ln"><b>Last Name:</b></label>
            <input type="text" name="lname" placeholder="Enter Last Name" class="lna" required>
            <label class="con"><b>Contact No:</b></label>
            <input type="tel" name="con" placeholder="Enter First Name" class="cont" required>
            <label class="em"><b>Email:</b></label>
            <input type="email" name="umail" placeholder="Enter Email" class="mail" required>
            <label class="p"><b>Password:</b></label>
            <input type="password" name="upass" placeholder="Enter Password" class="pass" required>
            <input type="submit" value="Sign In" class="sub">
            <input type="reset" value="Reset" class="res">
            <p class="para">Already have an account?<span><a href="index.jsp">Log In</a></span></p>
            </form>
        </div>
    </body>
</html>
