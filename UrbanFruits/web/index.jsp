<%-- 
    Document   : HomePage
    Created on : Nov 15, 2018, 2:08:38 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
              crossorigin="anonymous">
    </head>

    <body>
        <div class='font-moonlight'>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto" style="margin-top: 2%    ;margin-bottom: 1% ;">
                        <li class="nav-item active" style="margin-left: -50px; margin-top:-3px;">
                            <a class="nav-link"href="index.jsp">Home
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ProductAll" style=" margin-top:-3px; margin-left: 180px;">Products</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ShowCart" style=" margin-top:-3px; margin-left: 180px;">Cart()</a>
                        </li>       
                        <li><form action="SearchProduct" method="post" class="form-inline my-2 my-lg-0" style="margin-left: -130px;">                               
                                <input type="text" required minlength="3" name="productName" class="form-control mr-sm-2" type="search" placeholder="Search here ..." aria-label="Search" style=" margin-left: 295px; padding-left: 120px;padding-right: 25px;margin-top: -5px;">
                                <input type="hidden" value="1" name="categoryId">
                            </form></li>
                        <li class="nav-item" style="margin-left: -158px; margin-top: 16px;">
                            <a href="Login"><button type="button" class="btn btn-outline-success" style="margin-top: -30px; padding-left: 20px; padding-right : 20px;">Login</button></a>
                        </li>                      
                    </ul>         
                </div>
            </nav>
            <div class="topicText">Urban</div>
            <div class="text">Fruit & Vegetable</div>
            <div>
                <a href="">
                    <button class="topicbtn">Order Now</button>
                </a>
            </div>
            <img class="pic-margin fit-image" src="css/picture/topic.jpg" width='100%'>
            <div class="container margin-last">
                <div class="picRow">
                    <img class="pic" src="css/picture/vegetable.jpg">
                    <a href="ProductVeg">
                        <button class="btn1">Vegetable</button>
                    </a>
                    <img class="pic" src="css/picture/fruit.jpg">
                    <a href="ProductFruit">
                        <button class="btn2">Fruit</button>
                    </a>
                </div>
                <div class="picRow">
                    <img class="pic" src="css/picture/juice.jpg">
                    <a href="ProductJuice">
                        <button class="btn4">Juice</button>
                    </a>
                    <img class="pic" src="css/picture/driedfruit.jpg">
                    <a href="ProductDriedFruit">
                        <button class="btn3">Dried Fruit</button>
                    </a>
                </div>
            </div>
        </div>

    </body>

</html>