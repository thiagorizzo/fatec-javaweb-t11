<%@page import="viewmodels.ProdutoCarrinho"%>
<%@page import="java.util.List"%>
<%

    List<ProdutoCarrinho> carrinho = (List<ProdutoCarrinho>) request.getAttribute("carrinho");
    for(ProdutoCarrinho p : carrinho) {
%>

    <div>
        Nome: <%= p.getProduto().getNome() %>
        Preço: <%= p.getProduto().getPreco() %>
        Quantidade: <%= p.getQuantidade() %>
        Total: <%= p.getTotal() %>
    </div>

<%
    }
%>