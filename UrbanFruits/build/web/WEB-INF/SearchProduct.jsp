<%-- 
    Document   : SearchProduct
    Created on : Nov 12, 2018, 8:23:49 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SearchProduct" method="POST">
            Enter product name:
            <input type="text" required name="productName"/>
            <input type="submit"/>
        </form>

    </body>
</html>
