<%-- 
    Document   : Error
    Created on : 26/01/2019, 08:58:32
    Author     : MAQ01LAB04
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <%
            Exception ex = (Exception) request.getAttribute("exception");
        %>
        <h3>Ocorreu um erro:</h3>
        <h4 style="color:red">
            <%= ex.getMessage() %>
        </h4>
    </body>
</html>
