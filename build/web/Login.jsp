<%-- 
    Document   : Login
    Created on : 02/02/2019, 10:15:31
    Author     : FATECRP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>
        <c:if test="${erroLogin != null}">
            <h1 style="color:red">
                ${erroLogin}
            </h1>
        </c:if>
           
        <form method="POST" action="/ProjetoWeb/AutenticarUsuario">
            <div class="form-group">
                <label>Nome:</label>
                <input class="form-control" type="text" id="nome" name="nome"/>
            </div>
            <div class="form-group">
                <label>Senha:</label>
                <input class="form-control" type="password" id="senha" name="senha"/>
            </div>
            <input class="btn btn-classic" type="submit" value="Login"/>
        </form>
    </body>
</html>
