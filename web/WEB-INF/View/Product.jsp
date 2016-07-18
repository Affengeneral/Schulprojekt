<%-- 
    Document   : Product
    Created on : 26.04.2016, 10:29:34
    Author     : Alex
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="Resources/css/Product.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="container">
            <div id="header">
                <h2>${product.name}</h2>
                <h3>${product.manufacturer}</h3>
            </div>

            <div id="picture">
                <form method="GET" id="pictureForm">
                    <input type="hidden" name="productId" value="${product.number}" />
                    <input type="hidden" name="action" value="details" />
                    <input type="image" src="${product.pictureName}" height="100%" width="100%" />
                </form>
            </div>

            <div id="section">
                <span>${product.description}</span>
            </div>

            <div id="footer">
                <div style='display: inline-block; float: left; text-align: left'>Auf Lager: ${product.stock}</div>
                <div style='display: inline-block; float: right; text-align: right'>
                    <form method="POST" action="Products" >
                        <table>
                            <tr>
                                <td>
                                    <fmt:formatNumber type="currency" value="${product.price}" currencySymbol="€" ></fmt:formatNumber>
                                    </td>
                                    <td>
                                        <input type="hidden" name="productId" value="${product.number}" >
                                    <input type="submit" name="action" class="addtocartbutton" value="addToCart"></td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
        </div>
        <c:out value="${pageContext.request.queryString}" />
    </body>
</html>
