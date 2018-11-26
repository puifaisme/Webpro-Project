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
    </head>
    <body>
        <h1>cart</h1>
        <table>
             <c:forEach var="cartlist" items="${sessionScope.cart.lineItem}" varStatus="vs">
                 <tr>
                     <td>${vs.count}</td>
                     <td><img src="${pageContext.request.contextPath}/${cartlist.product.getImage()}"width="180"</td>
                     <td>${cartlist.product.price}</td>                  
                     <td> 
                         <form action="RemoveCart">
                     <input type="hidden" name="delete" value="${cartlist.product.productId}">
                     <button type="submit">x</button>
                        </form>
                     </td>
                 </tr>
               
                 
             </c:forEach>
                 Total ${sessionScope.cart.getTotalPrice()}baht
            
            
        </table>
       
    </body>
</html>
