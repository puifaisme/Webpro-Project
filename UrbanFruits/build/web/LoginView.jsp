<%-- 
    Document   : LoginView
    Created on : 04-Nov-2018, 22:41:52
    Author     : Chonticha Sae-jiw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="CSS/Login.css">
    </head>
    <body>
        <div class='font-moonlight'>
            <ul class="nav-fix">
                <li><a href="index.html">Home</a></li>
                <li><a href="#news">Products</a></li>
                <li><a href="UrbanCart">Cart</a></li>
                <li><input type='textr'></input></li>
                <li><button>Login</button></li>
            </ul>
            <img  class="pic-margin index" src="Backgroung-Picture/Pic-Login.jpg" width='100%'>
        </div>
        <div class="contrainer">
            <form action="Login" method="post">
                <table class="table">
                    <tr>
                        <td>User Name: </td>
                        <td><input type=text" name="userName" required</td>
                    </tr>
                    <tr>
                        <td>Password: </td>
                        <td><input type="password" name="password" required</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login"</td>
                    </tr>
                    <tr>
                        <td colspan="2"<p style="color:red"${message}</p></td>                           
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>