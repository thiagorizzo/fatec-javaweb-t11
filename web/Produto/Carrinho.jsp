<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="viewmodels.ProdutoCarrinho"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Produto</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>
        <core:forEach var="produtoCarrinho" items="${produtosCarrinho}">
           <div>
               <span>Nome:</span><span>${produtoCarrinho.getProduto().getNome()}</span>
               <span>Preço:</span><span>${produtoCarrinho.getProduto().getPreco()}</span>
               <span>Quantidade:</span><span>${produtoCarrinho.getQuantidade()}</span>
               <span>Total:</span><span>${produtoCarrinho.getTotal()}</span>
           </div>
       </core:forEach>
    </body>
</html>    