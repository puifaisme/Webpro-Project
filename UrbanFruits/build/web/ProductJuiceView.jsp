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
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <link href="css/ProductList.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
              crossorigin="anonymous">
    </head>
    <body>
        <div class='font-moonlight'>
           <nav class="navbar navbar-expand-lg navbar-light bg-light col-12 col-md-12">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto col-8" style="margin-top: 6px    ;margin-bottom: 6px;">
                        <li class="nav-item">
                            <a class="nav-link" style="margin-left: 190px;" href="index.jsp">Home
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item" >
                            <a class="nav-link" style="margin-left: 160px;" href="ProductAll">Products</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" style="margin-left: 160px;" href="ShowCart">Cart</a>
                        </li>                                                      
                    <form action="SearchProduct" class="form-inline my-2 my-lg-0 col-4" style="margin-left: 190px;">
                        <input name="productName" minlength="3" class="form-control mr-sm-2" type="search" placeholder="Search here" aria-label="Search">
                        <input type="hidden" name="categoryId" value="1">
<!--                        <a href="Login"><button class="btn btn-outline-success my-2 my-sm-0" type="submit">Login</button></a>-->
                    </form>
                        <div style="margin-top: 9px">
                                                     <a href="Login"><button type="button" class="btn btn-outline-success my-2 my-sm-0" style="margin-left: -50px;">Login</button></a>
                        </div>
   
                  </ul>          
                </div>
            </nav>
            <img  src="Backgroung-Picture/Pic-Veg.jpg" width='100%'>
            <div class="dropdown">
                <button class="dropbtn"><img src="Icon/arrow.png" width="2%" class="margin-icon">search by . .</button>
                <div class="dropdown-content">
                    <a href="ProductVeg">Vegetables</a>
                    <a href="ProductDriedFruit">Dried Fruit</a>
                    <a href="ProductJuice">Juice</a>
                </div>
            </div>
            <div class="flex-container margin-page">
        <c:forEach items="${products}" var="pJ" varStatus="num">
                    <div class="font-moonlight-bold">
                        <div><img src="${pageContext.request.contextPath}/${pJ.image}" width="250" height="220"></div>
                        <div class="name">${pJ.productName}</div>
                        <div class="price">${pJ.price} BATH / 1 KG</div>
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
                            <div><button type="submit" class="btn-success margin-loop" style="margin-top: 15px;">ADD TO CART</button></div>
                        </form>             
                    </div>
                </c:forEach>
            </div>
        </div>
</body>
</html>
