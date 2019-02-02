<%-- 
    Document   : Login
    Created on : 02/02/2019, 10:15:31
    Author     : FATECRP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="/AutenticarUsuario">
            <label>Nome:</label>
            <input type="text" id="nome" name="nome"/>
            <label>Senha:</label>
            <input type="password" id="senha" name="senha"/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
