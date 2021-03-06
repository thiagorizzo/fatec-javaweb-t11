<%@page import="java.util.List"%>
<%@page import="models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mt" uri="/WEB-INF/tlds/bibliotecatags.tld"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Produtos</title>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script>
            var buscarProdutosCarrinho = () => {
                $.get("/ProjetoWeb/ListarCarrinho",
                    function(data, a, e) {
                        debugger;
                        console.log(data);
                    });
            }
            
            var adicionarProduto = (idProduto) => {
                $.post("/ProjetoWeb/AdicionarCarrinho?id=" + idProduto,
                    function(data) {
                        if (data != "")
                            document.body.innerHTML = data
                        else
                            alert("produto adicionado com sucesso.");
                    });
            }
        </script>
    </head>
    <body>
        <%@include file="/Cabecalho.jsp" %>
        <h1>Produtos</h1>
        <c:forEach var="item" items="${produtos}">
            ${item.nome}
        </c:forEach>
        <%--<mt:gridProdutos produtos="${produtos}"></mt:gridProdutos>--%>
    </body>
</html>
