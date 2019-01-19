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
@WebServlet(name = "ProdutoController", urlPatterns = {"/Produto"})
public class ProdutoController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IProdutoService produtoService = new ProdutoService();
        List<Produto> produtos = produtoService.listarProdutos();
        
        request.setAttribute("produtos", produtos);
        
        RequestDispatcher rd = request.getRequestDispatcher("Produto/ListarProdutos.jsp");
        rd.forward(request, response);
    }
}
