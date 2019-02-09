<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <c:set var="numero1" value="10"/>
        <p>valor de número1 é : <c:out value="${numero1}"/></p>
        <p>valor de número1 é: ${numero1}</p>
        
        <c:catch var="errorMessage">
            <c:set var="x" value="${numero1 % 0}"/>
        </c:catch>
        <p>${errorMessage}</p>
        
        <c:if test="${numero1 % 2 == 0}">
            <p>Numero1 é par</p>
        </c:if>
            
        <c:set var="numero2" value="5"/>            
        <c:choose>
            <c:when test="${numero1 > numero2}">
                <c:out value="Número1 é maior do que Número2"/>
            </c:when>
            <c:when test="${numero2 > numero1}">
                <c:out value="Número2 é maior do que Número1"/>
            </c:when>
            <c:otherwise>
                <c:out value="Número2 e Número1 são iguais"/>
            </c:otherwise>
        </c:choose>
        
        <c:forEach var="i" begin="1" end="5">
            <p>Item <c:out value="${i}"/></p>
        </c:forEach>
            
        <c:forTokens items="JDBC,Servlets,JSP" delims="," var="item">
            <p><c:out value="${item}"/></p>
        </c:forTokens>
            
            
        <c:set var="agora" value="<%= new java.util.Date()%>" />
        <c:set var="numero" value="4.5" />
        <p>Moeda: <fmt:formatNumber type="currency" value="${numero}"/></p>
        <p>Número: <fmt:formatNumber type="number" pattern="####,###E0" value="${numero}"/></p>
        <p>Percentual: <fmt:formatNumber type="percent" value="${numero}"/></p>

        <p>Data Formato1: <fmt:formatDate pattern="dd-MM-yyyy" value="${agora}"/></p>
        <p>Data Formato2: <fmt:formatDate type="both" dateStyle="long" timeStyle="short" value="${agora}"/></p>
        <p>Data Formato3: <fmt:formatDate type="both" dateStyle="medium" timeStyle="long" value="${agora}"/></p>
        <p>Somente data: <fmt:formatDate type="date" value="${agora}"/></p>
        <p>Somente hora: <fmt:formatDate type="time" value="${agora}"/></p>   
        
        <sql:setDataSource var="datasource" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/projetoweb?serverTimezone=UTC" user="root" password=""/>

        <%--<sql:update dataSource="${meuBD}" var="count">INSERT INTO Produto(nome, preco, idcategoria) VALUES ('borracha', 0.5, 1);</sql:update>--%>

        <sql:query dataSource="${datasource}" var="rsProdutos">SELECT * FROM Produto</sql:query>
        <c:forEach var="produto" items="${rsProdutos.rows}">
                <p>Código:<c:out value="${produto.codigo}"/>, Nome:<c:out value="${produto.nome}"/></p>
        </c:forEach>        
       
        <c:set var="curso" value="Consultoria Web"/>
        <p>Total de Caracteres : ${fn:length(curso)}</p>
        <c:if test="${fn:contains(curso, 'web')}" >
                <p>Curso é relacionado a Web</p>
        </c:if>
        <c:if test="${fn:containsIgnoreCase(curso, 'web')}" >
                <p>Curso é relacionado a Web</p>
        </c:if>                
                
</html>
