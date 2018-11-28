<%-- 
    Document   : LoginView
    Created on : 04-Nov-2018, 22:41:52
    Author     : Chonticha Sae-jiw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--<html style="background: url('Backgroung-Picture/Pic-Login.jpg')no-repeat center center fixed;">-->
<html class="body-background">
    <head>


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/ProductList.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <style>

        </style>
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
            <!--            <img  class="pic-margin index" src="Backgroung-Picture/Pic-Login.jpg" width='100%'>-->
        </div>
        <div class="contrainer">
            <div class="layout">
                <div class="font-new"><b>Sign in</b></div>
                <form action="Login" method="post">
                    <div class="wrap-input100 validate-input" >
                        <input class="input100" type="text" name="email" placeholder="Enter Email">
                        <span class="focus-input100" data-placeholder="&#xf207;"></span>
                    </div>

                    <div class="wrap-input100 validate-input">
                        <input class="input100" type="password" name="password" placeholder="Enter Password">
                        <span class="focus-input100" data-placeholder="&#xf191;"></span>
                    </div>
                    <div class="container-login100-form-btn">
                        <input type="submit" class="btn btn-primary btn-lg" value="Login">
                    </div>


                </form>
            </div>
        </div>
        
    </body>
</html>