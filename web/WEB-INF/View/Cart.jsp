<%-- 
    Document   : Cart
    Created on : 26.04.2016, 12:47:00
    Author     : Alex
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link type="text/css" rel="stylesheet" href="Resources/css/Product.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Warenkorb</title>
    </head>
    <body class="background">
        <div id="cartBody">
            <h1 class="headerTitle"><b><u>Mein Warenkorb</u></b></h1>
            <table id="cartTable" border="1">
                <tr>
                    <th>Id</th>
                    <th>Produkt</th>
                    <th>Anzahl</th>
                    <th>Preis</th>
                </tr>
                <c:forEach var="entry" items="${cart.cartEntries}">
                    <tr>
                        <td>${entry.id}</td>
                        <td>${entry.product.name}</td>
                        <td>${entry.count}</td>
                        <td>${entry.sum} €</td>
                        <td style="width: 16px; height: 16px;">
                            <form method="POST" id="pictureForm">
                                <input type="image" style="width: 16px; height: 16px;" src="Resources/img/deleteButton.png" name="deleteEntry_${entry.id}" />
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="3">Summe:</td>
                    <td>${cart.sum}</td>
                </tr>
            </table>

            <div>
                <form method="POST">
                    <button type="submit" id="backToProductsButton" name="backToProducts">Zurück</button>
                </form>
            </div>
        </div>
    </body>
</html>
