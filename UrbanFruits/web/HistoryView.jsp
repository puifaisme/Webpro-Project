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
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>History</h1>
        <table>
            <tr>
                <th>#</th>
                <th>ID</th>
                <th>TimeStamp</th>
                <th>Count</th>
                <th>Total Price</th>
            </tr>

            <tr>
                <c:forEach items="${historyOrders}" var= "his" varStatus = "vs">
                <tr>
                    <td>${vs.count}</td>
                    <td>${his.historyId}</td>
                    <td>${his.timeStamp}</td>
                    <td>${his.historyCount}</td>
                    <td>${his.totalPrice}</td>
                </tr>
            </c:forEach>
        </tr>
    </table>
    ${flag}
    <a href="MyAccount.jsp">Back</a>

</body>
</html>
