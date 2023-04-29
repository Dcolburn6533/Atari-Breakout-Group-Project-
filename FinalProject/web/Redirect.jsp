<%-- 
    Document   : Redirect
    Created on : Apr 28, 2023, 10:01:17 PM
    Author     : kiernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title>Atari Breakout</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Style.css" />
    </head>
    <body>
        <img src="Images/Atari_Logo.png" alt="Atari Logo" class = "logo"><br /><br />
        
        <form method="post" action="Login">
            <h5>There was an error with your previous submission, please make sure you enter both a valid username and password to login. Otherwise, create your own account and sign in!</h5>
            <h3>Username: </h3> 
            <input type="text" id="username" name="username"><br>
            <h3>Password: </h3>
            <input type="password" id="password" name="password"><br /><br />
            <input type="submit" value="Log In" id="logIn" name="logIn" style="margin-right: 50px"><input type="submit" value="Sign Up" id="signUp" name="signUp">
        </form>
    </body>
</html>
