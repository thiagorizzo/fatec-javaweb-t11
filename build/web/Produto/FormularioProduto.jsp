<%-- 
    Document   : FormularioProduto
    Created on : 19/01/2019, 12:35:37
    Author     : MAQ01LAB04
--%>

<%@page import="models.Categoria"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Produto</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>
        <%
            List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
        %>
        
        <form method="POST" action="/ProjetoWeb/CadastrarProduto">
             <div class="form-group">
                <label>Nome:</label>
                <input class="form-control" type="text" id="nome" name="nome"/>
             </div>
             <div class="form-group">
                <label>Preço:</label>
                <input class="form-control" type="number" id="preco" name="preco"/>
             </div>
             <div class="form-group">
                <label>Categoria:</label>
                <select class="form-control" name="categoria">
                    <% for(Categoria c : categorias) { %>
                        <option value='<%= c.getId() %>'><%= c.getNome() %></option>
                    <% } %>
                </select>
             </div>
            <input type="submit" value="Cadastrar"/>
        </form>
    </body>
</html>
