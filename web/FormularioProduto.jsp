<%-- 
    Document   : FormularioProduto
    Created on : 19/01/2019, 12:35:37
    Author     : MAQ01LAB04
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="/ProjetoWeb/CadastrarProduto">
            <label>Nome:</label>
            <input type="text" id="nome" name="nome"/>
            <label>Preço:</label>
            <input type="number" id="preco" name="preco"/>
            <label>Categoria:</label>
            <select name="categoria">
                <option value="2">Jogos</option>
                <option value="1">Material Escolar</option>
            </select>
            <input type="submit" value="Cadastrar"/>
        </form>
    </body>
</html>
