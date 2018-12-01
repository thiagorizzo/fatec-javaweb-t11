package controllers;

import controllers.interfaces.IProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Produto;
import services.ProdutoService;

@WebServlet(
    name = "Controller Produto",
    urlPatterns = { "/Produtos", "/ListarProduto" },
    initParams = {  
        @WebInitParam(name = "connectionString", value = "blablabla" ),
        @WebInitParam(name = "TituloAplicacao", value = "ProjetoWeb" ),
    }
)
public class ProdutoController extends HttpServlet {
    
    // TODO: injetar dependência
    IProdutoService produtoService;
    
    @Override
    public void init(ServletConfig config) {
        String connectionString = config.getInitParameter("connectionString");
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Produto> produtos = produtoService.ListarProdutos();

        request.setAttribute("produtos", produtos);
        
        RequestDispatcher rd = request.getRequestDispatcher("Produto/ListarProdutos.jsp");
        rd.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
    }

    @Override
    public void destroy() {
        
    }
}
