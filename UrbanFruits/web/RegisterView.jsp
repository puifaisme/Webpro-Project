<%-- 
    Document   : RegisterView
    Created on : Nov 3, 2018, 4:38:09 PM
    Author     : Bud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="Register" method="POST">
            FIRSTNAME
            <input type="text" name="firstName"><br>
            LASTNAME
            <input type="text" name="lastName"><br>
            EMAIL
            <input type="text" name="email"><br>
            password
            <input type="password" name="password"><br>
            AGE
            <input type="number" name="age"><br>
            GENDER
            <input type="radio" name="gender" value="male">male
            <input type="radio" name="gender" value="female">female
            <br><br>
            <input type="submit">
            
            
            
            
        </form>
        
    </body>
</html>
