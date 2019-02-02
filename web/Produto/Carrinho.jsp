<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="viewmodels.ProdutoCarrinho"%>
<%@page import="java.util.List"%>

 <core:forEach var="produtoCarrinho" items="${produtosCarrinho}">
    <div>
        <span>Nome:</span><span>${produtoCarrinho.getProduto().getNome()}</span>
        <span>Preço:</span><span>${produtoCarrinho.getProduto().getPreco()}</span>
        <span>Quantidade:</span><span>${produtoCarrinho.getQuantidade()}</span>
        <span>Total:</span><span>${produtoCarrinho.getTotal()}</span>
    </div>
</core:forEach>
