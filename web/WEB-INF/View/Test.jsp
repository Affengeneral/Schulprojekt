<%-- 
    Document   : Test
    Created on : 14.07.2016, 13:41:08
    Author     : spitzmessera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="Resources/css/Product.css">
        <title>JSP Page</title>
    </head>
    <body class="background">
        <div class="center"><div id="container" >
                <div id="header">
                    <h2>${product.name}</h2>
                    <h3>${product.manufacturer}</h3>
                </div>

                <div id="picture">
                    <form method="GET" id="pictureForm">
                        <input type="hidden" name="productId" value="${product.number}" />
                        <input type="hidden" name="action" value="details" />
                        <input type="image" src="${product.pictureName}" />
                    </form>
                </div>

                <div id="section">
                    <span>${product.description}</span>
                </div>
            </div>
            <div id="section">
                <div style="display: inline-block; float: left; text-align: left;">
                    <form method="GET">
                        <input type="hidden" name="action" value="backToProducts" />
                        <input type="submit" value="weitershoppen!"/>
                    </form>
                </div>
                <div style="display: inline-block; float: right; text-align: left;">
                    <form method="GET">
                        <input type="hidden" name="action" value="viewCart" />
                        <input type="submit" value="Einkaufswagen" />
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
