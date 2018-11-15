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
        <form action="SearchProduct" method="POST">
            Enter product name: 
            <input type="text" required name="productName"/>
            <input type="hidden" name="categoryId" value="1"/>

            <input type="submit"/>
        </form>
        <table id="example" class="table">
            <thead>
            <th>No</th>
            <th>ID</th>
            <th>Image</th>
            <th>Name</th>
            <th>Price</th>
        </thead>
        <c:forEach items="${products}" var="pV" varStatus="num">
            <tr>
                <td>${num.count}.</td>
                <td>${pV.productId}</td>
                <td><img src="${pageContext.request.contextPath}/${pV.image}" width="180"></td>
                <td>${pV.productName}</td>
                <td>${pV.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
