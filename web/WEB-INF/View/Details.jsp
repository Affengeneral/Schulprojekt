<%-- 
    Document   : Details
    Created on : 02.05.2016, 22:17:14
    Author     : Alex
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="Resources/css/Product.css" >
        <title>${product.name}</title>
    </head>
    <body class="background">
        <div class="center">
            <form method="POST">
                <input type="submit" id="backToProductsButton" name="backToProducts" value="<-- Zurück" />
            </form>
            <h1 class="headerTitle" ><b><u>${product.name}</u></b></h1>
            <div style="background-color: rgba(255,255,255,0.7); text-align: justify;">${product.description}</div>
        </div>
    </body>
</html>
