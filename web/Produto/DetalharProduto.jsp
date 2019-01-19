<%-- 
    Document   : DetalharProduto
    Created on : 19/01/2019, 12:26:21
    Author     : MAQ01LAB04
--%>

<%@page import="models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Produto produto = (Produto) request.getAttribute("produto");
        %>
        <%= produto.getNome() %>
    </body>
</html>
