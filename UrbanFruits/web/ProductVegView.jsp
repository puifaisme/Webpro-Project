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
        <link rel="stylesheet" type="text/css" href="css/ProductList.css">
    </head>
    <script>
        function AddCount() {
        
    }
    </script>
    <body>
        <div class='font-moonlight'>
            <ul class="nav-fix">
                <li><a href="index.html">Home</a></li>
                <li><a href="#news">Products</a></li>
                <li><a href="UrbanCart">Cart</a></li>
                <li>
                    <form action="SearchProduct" method="post">
                        <input type="text" required minlength="3" name="productName">
                        <input type="hidden" value="1" name="categoryId">
                        <input type="submit">
                    </form>
                 
                </li>
                <li><button>Login</button></li>
            </ul>
            <img  class="pic-margin" src="Backgroung-Picture/Pic-Veg.jpg" width='100%'>
            <div class="dropdown">
                <button class="dropbtn"><img src="Icon/arrow.png" width="2%" class="margin-icon">search by . .</button>
                <div class="dropdown-content">
                    <a href="ProductFruit">Fruit</a>
                    <a href="ProductDriedFruit">Dried Fruit</a>
                    <a href="ProductJuice">Juice</a>
                </div>
            </div>
            <div class="flex-container margin-page">
                <c:forEach items="${products}" var="pV" varStatus="num">
                    <div class="font-moonlight-bold">
                        <div><img src="${pageContext.request.contextPath}/${pV.image}" width="200" height="200"></div>
                        <div class="name">${pV.productName}</div>
                        <div class="price">${pV.price} BATH / 1 KG</div>
                        <button onclick="" >-</button>
                        <input type='text' name='quantity'/>
                        <button onclick="" >+</button>
                        <div><button type="button" class="btn-success margin-loop">ADD TO CART</button></div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
