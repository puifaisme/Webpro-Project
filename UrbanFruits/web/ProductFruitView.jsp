<%-- 
    Document   : ProductList
    Created on : Nov 3, 2018, 8:11:47 PM
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
        <h1>Vegetable</h1>
        <table id="example" class="table">
            <thead>
            <th>No</th>
            <th>ID</th>
            <!--<th>Image</th>-->
            <th>Name</th>
            <th>Price</th>
        </thead>
        <c:forEach items="${products}" var="pV" varStatus="num">            
            <tr>
                <td>${num.count}</td>
              <!-- <td><img src="PictureVeg/${num.count}.png" width="120"></td>-->
                <td>${pV.productId}</td>
                <td>${pV.productName}</td>
                <td>${pV.price}</td>
            </tr>
        </c:forEach>
    </table>           
</body>
</html>
