/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.RequestDispatcher;

import models.Produto;
import viewmodels.ProdutoCarrinho;

/**
 *
 * @author MAQ01LAB04
 */
@WebServlet(name = "ListarCarrinho", urlPatterns = {"/ListarCarrinho"})
public class ListarCarrinho extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        List<ProdutoCarrinho> produtosCarrinho = null;
        if (!session.isNew()) {
            produtosCarrinho = (List<ProdutoCarrinho>) session.getAttribute("produtosCarrinho");
            request.setAttribute("carrinho", produtosCarrinho);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("Produto/Carrinho.jsp");
        rd.forward(request, response);
    }
}
