<%-- 
    Document   : ActivateView
    Created on : Nov 3, 2018, 4:37:32 PM
    Author     : Bud
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ACTIVATE</h1>
        <form action="Activate" method="post">
            email
        <input type="text" name="email">
        <c:if test="${activate != null}">
            <a href="Activate?email=${email}&activateKey=${activate}">Activate Here!!</a>
        </c:if>
        
        </form>
        
    </body>
</html>
