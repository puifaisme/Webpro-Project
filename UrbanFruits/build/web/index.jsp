<%-- 
    Document   : HomePage
    Created on : Nov 15, 2018, 2:08:38 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <link href="css/css.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
              crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>

    <body>
        <div class='font-moonlight'>
            <nav class="navbar navbar-expand-lg navbar-light bg-light fix col-12 col-md-12">
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