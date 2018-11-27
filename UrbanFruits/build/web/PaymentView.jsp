<%-- 
    Document   : PaymentView
    Created on : Nov 15, 2018, 6:25:37 PM
    Author     : Bud
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Payment">
            <table>
                <tr>
                    <th>No.</th>
                    <th>Product ID</th>
                    <th>Price</th>
                </tr>
                <c:forEach var="cartlist" items="${sessionScope.cart.lineItem}" varStatus="vs">
                    <tr>
                        <th>${vs.count}</th>
                        <th>${cartlist.product.productId}</th>
                    <input type="hidden" name="productNo" value="${cartlist.product.productId}">
                    <th>${cartlist.product.price}</th>
                            
                    </tr>
                    
            </c:forEach>
            </table><br><br>
            <input type="text" name="idCard" required="" placeholder="IDCARD">
            <button type="submit">PAY</button>
        </form>
        
    </body>
</html>
