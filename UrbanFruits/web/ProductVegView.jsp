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
        <link rel="stylesheet" type="text/css" href="css/css.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
              crossorigin="anonymous">
    </head>
    <body>
        <div class='font-moonlight'>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto" style="margin-top: 1%    ;margin-bottom: 1%; margin-bottom: -6px;">
                        <li class="nav-item active" style="margin-left: -50px;">
                            <a class="nav-link"href="index.jsp">Home
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ProductAll">Products</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ShowCart">Cart()</a>
                        </li>       
                        <li><form action="SearchProduct" method="post" class="form-inline my-2 my-lg-0" style="margin-left: -130px;">                               
                                <input type="text" required minlength="3" name="productName" class="form-control mr-sm-2" type="search" placeholder="Search here ..." aria-label="Search" style="padding-left: 70px;padding-right: 70px;margin-top: -2px;">
                                <input type="hidden" value="1" name="categoryId">
                            </form></li>
                        <li class="nav-item" style="margin-left: -320px;">
                            <a href="Login"><button type="button" class="btn btn-outline-success" style="margin-top: -22px; padding-left: 20px; padding-right : 20px;">Login</button></a>
                        </li>                      
                    </ul>         
                </div>
            </nav>
            <img src="Backgroung-Picture/Pic-Veg.jpg" width='100%'>
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
                    <div class="font-moonlight-bold margin-product">
                        <div><img src="${pageContext.request.contextPath}/${pV.image}" width="auto" height="200"></div>
                        <div class="name">${pV.productName}</div>
                        <div class="price">${pV.price} BATH / 1 KG</div>
                        <form action="AddToCart">
                            <span onclick="var effect = document.getElementById('qty'); var qty = effect.value; if (!isNaN(qty) & amp; & amp; qty & gt; 1) effect.value--; return false;">
                                <img src="Icon/minus.png" width="auto" height="30px">
                            </span>
                            <input type="quantity" class="" id="qty" step="1" min="1" max="20" name="quantity" value="1" size="3" style="text-align: center">
                            <span  onclick="var effect = document.getElementById('qty');
                                    var qty = effect.value;
                                    if (!isNaN(qty))
                                        effect.value++;
                                    return false;">
                                <img src="Icon/plus.png" width="auto" height="30px">
                            </span>
                            <input type="hidden" value="${pV.productId}" name="proId">
                            <div><button type="submit" class="btn-success margin-loop" style="">ADD TO CART</button></div>
                        </form>             
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
