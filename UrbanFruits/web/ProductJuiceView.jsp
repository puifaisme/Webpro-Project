<%-- 
    Document   : ProductJuiceView
    Created on : Nov 8, 2018, 4:39:50 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Juice</h1>
         <form action="SearchProduct" method="POST">
            Enter product name: 
            <input type="text" required name="productName"/>
            <input type="hidden" value="4" name="categoryId"/>
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
        <c:forEach items="${products}" var="pJ" varStatus="num">
            <tr>
                <td>${num.count}</td>
                <td>${pJ.productId}</td>
                <td><img src="${pageContext.request.contextPath}/ProductFruit/${pJ.image}" width="180"></td>
                <td>${pJ.productName}</td>
                <td>${pJ.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
