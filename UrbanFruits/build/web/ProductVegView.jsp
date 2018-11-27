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
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
    </head>
    <body>
        <div class='font-moonlight'>
            <nav class="navbar navbar-expand-lg navbar-light bg-light col-12 col-md-12">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto col-8" style="margin-top: 1%    ;margin-bottom: 1%;">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.jsp">Home
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ProductAll">Products</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ShowCart">Cart()</a>
                        </li>                                     
                    </ul>
                    <form class="form-inline my-2 my-lg-0 col-4" style="margin-right: 10%">
                        <input minlength="3" class="form-control mr-sm-2" type="search" placeholder="Search here" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form> 
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
                            <span class="btn btn-danger" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;">
                                -
                            </span>
                            <input type="quantity" class="qty-text" id="qty" step="1" min="1" max="20" name="quantity" value="1">
                            <span class="btn btn-success" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if (!isNaN(qty))
                                        effect.value++;
                                    return false;">
                                +
                            </span>
                            <input type="hidden" value="${pV.productId}" name="proId">
                            <div><button type="submit" class="btn-success margin-loop">ADD TO CART</button></div>
                        </form>             
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
