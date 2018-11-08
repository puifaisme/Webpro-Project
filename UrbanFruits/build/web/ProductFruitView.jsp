<%-- 
    Document   : ProductList
    Created on : Nov 3, 2018, 8:11:47 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fruit</title>
    </head>
    <body>
        <h1>Fruit</h1>
        <table id="example" class="table">
            <thead>
            <th>No</th>
            <th>ID</th>
            <th>Image</th>
            <th>Name</th>
            <th>Price</th>
        </thead>
        <c:forEach items="${products}" var="pF" varStatus="num">
             <tr>
                <td>${num.count}</td>
                <td>${pF.productId}</td>
                <td><img src="${pageContext.request.contextPath}/PictureFruit/${pF.image}"width="180"</td>
                <td>${pF.productName}</td>
                <td>${pF.price}</td>
            </tr>
        </c:forEach>
            ${product.productId}
    </table>
</body>
</html>
