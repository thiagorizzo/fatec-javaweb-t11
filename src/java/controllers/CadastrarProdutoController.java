/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.interfaces.ICategoriaService;
import controllers.interfaces.IProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Categoria;
import models.Produto;
import services.CategoriaService;
import services.ProdutoService;

/**
 *
 * @author MAQ01LAB04
 */
@WebServlet(name = "CadastrarProdutoController", urlPatterns = {"/CadastrarProduto"})
public class CadastrarProdutoController extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ICategoriaService categoriaService = new CategoriaService();
            IProdutoService produtoService = new ProdutoService();
            
            String nomeProduto = request.getParameter("nome");
            float precoProduto = Float.parseFloat(request.getParameter("preco"));
            int categoriaProduto = Integer.parseInt(request.getParameter("categoria"));

            Categoria categoria = categoriaService.buscarPeloId(categoriaProduto);

            Produto produto = new Produto(nomeProduto, precoProduto, categoria);
            
            produtoService.cadastrarProduto(produto);
        } catch(Exception ex) {
            request.setAttribute("exception", ex);
            
            RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
            rd.forward(request, response);
            return;         
        }            
    }
}
