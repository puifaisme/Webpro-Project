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
        <title>JSP Page</title>
    </head>
    <body>
        <div class='font-moonlight'>
            <ul class="nav-fix">
                <li><a href="#home">Home</a></li>
                <li><a href="#news">News</a></li>
                <li><a href="#about">About</a></li>
                <li><input type='number'></input></li>
                <li><button>Login</button></li>
            </ul>
            <div class="topicText">Urban</div>
            <div class="text">Fruit & Vegetable</div>
            <div><a href=""><button class="topicbtn">Order Now</button></a></div>
            <img  class="pic-margin" src="css/picture/topic.jpg" width='100%'>           
            <div class="container">
                <div class="picRow">
                    <img class="pic" src="css/picture/vegetable.jpg">
                    <a href="ProductVeg"><button class="btn1">Vegetable</button></a>
                    <img class="pic" src="css/picture/fruit.jpg">
                    <a href="ProductFruit"><button class="btn2">Fruit</button></a>
                </div>
                <div class="picRow">
                    <img class="pic" src="css/picture/juice.jpg">
                    <a href="ProductJuice"><button class="btn4">Juice</button></a>
                    <img class="pic" src="css/picture/driedfruit.jpg">
                    <a href="ProductDriedFruit"><button class="btn3">Dried Fruit</button></a>               
                </div>
            </div>
        </div>
    </body>
</html>
