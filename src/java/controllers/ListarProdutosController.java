/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.interfaces.IProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Produto;
import services.ProdutoService;

/**
 *
 * @author MAQ01LAB04
 */
@WebServlet(name = "ListarProdutosController", urlPatterns = {"/ListarProduto"})
public class ListarProdutosController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IProdutoService produtoService = null;
        List<Produto> produtos = null;
        
        try {
            produtoService = new ProdutoService(); 
            produtos = produtoService.listarProdutos();
        } catch(Exception ex) {
            request.setAttribute("exception", ex);
            
            RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
            rd.forward(request, response);
            return;         
        }
        
        request.setAttribute("produtos", produtos);
        
        RequestDispatcher rd = request.getRequestDispatcher("Produto/ListarProdutos.jsp");
        rd.forward(request, response);
    }
}
