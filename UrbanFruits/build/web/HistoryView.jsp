<%-- 
    Document   : HistoryView
    Created on : Nov 13, 2018, 9:04:51 PM
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
        <title>JSP Page</title>
    </head>
    <style>
        .back-pic {
                position: absolute;
                left: 0px;
                top: 0px;
                z-index: -1;
        }
    </style>
    <body class="font-moonlight">
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
        <img class="back-pic fit-image1" src="Backgroung-Picture/Pic-History.jpg" width="1519px"/>
        <table>
            <tr>
                <th>No</th>
                <th>Product</th>
                 <th>Price</th>
                <th>Quantity</th>
                <th>Time</th>
                <th>TotalPrice</th>
                <th>EiEi</th>
            </tr>
            <c:forEach items="${historyOrders}" var="his" varStatus="vs">
                <tr>
                   <td>${vs.count}</td>
                    <td>${his.productName}</td>
                    <td>${his.price}</td>
                    <td>${his.quantity}</td>
                    <td>${his.timeStamp}</td>
                    <td>${his.TotalPrice}</td>
                    <td>${his.getTotalPrice()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
