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
        <title>Detalhar Produto</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>
        <%
            Produto produto = (Produto) request.getAttribute("produto");
        %>
        <%= produto.getNome() %>
    </body>
</html>
