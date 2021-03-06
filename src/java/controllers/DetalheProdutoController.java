/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.interfaces.IProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DetalheProdutoController", urlPatterns = {"/DetalheProduto"})
public class DetalheProdutoController extends HttpServlet {

    IProdutoService produtoService;
    
    public DetalheProdutoController() throws Exception {
         produtoService = new ProdutoService();
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        Produto produto;
        
        try {
            produtoService = new ProdutoService();        
            produto = produtoService.detalharProduto(id);   
            
            request.setAttribute("produto", produto);

            RequestDispatcher rd = request.getRequestDispatcher("Produto/DetalharProduto.jsp");
            rd.forward(request, response);            
        } catch(Exception ex) {
            request.setAttribute("exception", ex);
            
            RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
            rd.forward(request, response);
        }
    }
}
