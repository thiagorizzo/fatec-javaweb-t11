<%@page import="models.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div style="background: lightskyblue; font-size: 30px;">
    <c:choose>
        <c:when test="${usuarioAutenticado != null}">
          Usuário: ${ usuarioAutenticado.getNome() }
          <a href="/ProjetoWeb/DeslogarUsuario">Deslogar</a>
        </c:when>
        <c:otherwise>
            Usuário não autenticado. <a href="/ProjetoWeb/Login.jsp">Login</a>
        </c:otherwise>
    </c:choose>
</div>
