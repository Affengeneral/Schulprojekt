<%-- 
    Document   : Products
    Created on : 24.04.2016, 19:30:41
    Author     : Alex
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link type="text/css" rel="stylesheet" href="Resources/css/Product.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body class="background">
        <div class="center">
            <h1 class="headerTitle"><b><u>Der Blucmenladen</u></b></h1>
            <div style="height: 60px;">
                <div style="display: inline-block; float: right">
                    <form method="POST" action="Products">
                        <input type="submit" name="viewCart" class="shopcartbutton" value=""/>
                    </form>
                </div>
            </div>

            <c:forEach var="product" items="${products}">
                <c:set var="product" value="${product}" scope="request"></c:set>
                <jsp:include page="Product.jsp"></jsp:include>
                    <div style="height: 30px;"></div>
            </c:forEach>
        </div>
    </body>
</html>
