<%-- 
    Document   : RegisterView
    Created on : 04-Nov-2018, 22:42:30
    Author     : Chonticha Sae-jiw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <style>
        .btnForm:hover{
            opacity: 0.5;
        }

    </style>
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

        </div>
        <div class="row"> 
            <div class="contrainer">
                <div class="layout">
                    <div class="font-new" style="color: white"><b>Register</b></div>
                    <div class="inputForm">
                        
                            <table>
                                <form action="Register" method="post">
                                <tr>
                                    <td>FIRSTNAME</td>
                                    <td> <input type="text" name="firstName"><br><br></td>
                                </tr>
                                <tr>
                                    <td>LASTNAME</td>
                                    <td> <input type="text" name="firstName"><br><br></td>
                                </tr>
                                <tr>
                                    <td>EMAIL</td>
                                    <td><input type="text" name="email"><br><br></td>
                                </tr>
                                <tr>
                                    <td>password</td>
                                    <td><input type="password" name="password"><br><br></td>
                                </tr>
                                <tr>
                                    <td>AGE</td>
                                    <td><input type="number" name="age"><br><br></td>
                                </tr>
                                <tr>
                                    <td>GENDER</td>
                                    <td><input type="radio" name="gender" value="male">male
                                        <input type="radio" name="gender" value="female">female</td><br><br><br>
                                </tr>                       
                                <tr>                            
                                    <td>
                                        <div class="container-login100-form-btn btnForm">
                                            <input type="submit" style="background-color: #BC2D2D;border-color: #BC2D2D;color:white;" class="btn btn-primary btn-lg">
                                        </div>
                                    </td>
                                </tr>
                                </form>
                            </table>
                        
                    </div>
                </div>
            </div>
            <div>
                <img  class="bgPic" src="Backgroung-Picture/RegisPic.jpg"/>
            </div>
        </div>
    </body>
</html>
