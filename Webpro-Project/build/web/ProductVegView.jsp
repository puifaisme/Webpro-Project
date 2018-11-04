<%-- 
    Document   : ProductVegView
    Created on : 03-Nov-2018, 22:27:28
    Author     : Chonticha Sae-jiw
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
        <h1>Vegetable</h1>
        <table id="example" class="table">
            <thead>
            <th>No</th>
            <th>ID</th>
            <th>Image</th>
            <th>Name</th>
            <th>Price</th>
        </thead>
        <c:forEach items="${ProductVeg}" var="pV" varStatus="num">
            <tr>
                <td>${num.count}.</td>
                 <td>${pV.productId}</td>
                <td><img src="PictureVeg/${num.count}.jpg" width="120"></td>
                <td>${pV.productName}</td>
                <td>${pV.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
