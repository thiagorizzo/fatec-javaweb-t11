<%@page import="java.util.List"%>
<%@page import="models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Produtos</title>
    </head>
    <body>
        <h1>Produtos</h1>
        <table class="table table-stripped">
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Preço</th>
                <th>Categoria</th>
            </tr>
            
            
        <%
            List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
            for(Produto p : produtos) {
        %>

                <tr>
                    <td><%= p.getId() %></td>
                    <td><%= p.getNome() %></td>
                    <td><%= p.getPreco() %></td>
                    <td><%= p.getCategoria().getNome()%></td>
                </tr>

        <%
            }
        %>
        </table>
    </body>
</html>
