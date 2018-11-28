<%-- 
    Document   : AddToCartView
    Created on : Nov 18, 2018, 5:56:53 PM
    Author     : Bud
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/css.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
    </head>
    <body>
        <h1>cart</h1>
        <table>
            <c:forEach var="cartlist" items="${sessionScope.cart.lineItem}" varStatus="vs">
                <tr>
                    <td>${vs.count}</td>
                    <td><img src="${pageContext.request.contextPath}/${cartlist.product.getImage()}"width="180"</td>
                    <td>Price : ${cartlist.product.price}</td> 
                    <td>Quantity : ${cartlist.quantity}</td>
                    <td> 
                        <form action="RemoveCart">
                            <input type="hidden" name="delete" value="${cartlist.product.productId}">
                            <!--                            <button type="submit">x</button>-->
<!--                            <button type="button" class="close" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>-->
                        </form>                       
                    </td>
                </tr>


            </c:forEach>
        </table>
        <br>
        Total ${sessionScope.cart.getTotalPrice()}baht
        <br><br>
        <a href="Payment" >Payment</a>
    </body>
</html>
