<%-- 
    Document   : ProductDriedFruitView
    Created on : 04-Nov-2018, 15:27:21
    Author     : Chonticha Sae-jiw
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>Dried Fruit</title>
    </head>
    <body>
       
        
        <h1>Dried Fruit</h1>
         <form action="SearchProduct" method="POST">
            Enter product name: 
            <input type="text" required name="productName"/>
            <input type="hidden" value="3" name="categoryId"/>
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
        <c:forEach items="${products}" var="pD" varStatus="num">
            <tr>
                <td>${num.count}</td>
                <td>${pD.productId}</td>
                <td><img src="${pageContext.request.contextPath}/${pD.image}"width="180"</td>
                <td>${pD.productName}</td>
                <td>${pD.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
