/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.interfaces.IProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Produto;
import services.ProdutoService;
import viewmodels.ProdutoCarrinho;

/**
 *
 * @author MAQ01LAB04
 */
@WebServlet(name = "AdicionarCarrinho", urlPatterns = {"/AdicionarCarrinho"})
public class AdicionarCarrinho extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IProdutoService produtoService;
        
        int idProduto = Integer.parseInt(request.getParameter("id"));

        try {
            produtoService = new ProdutoService();
            HttpSession session = request.getSession();
            List<ProdutoCarrinho> produtosCarrinho;

            Object carrinho = session.getAttribute("produtosCarrinho");
            if (carrinho != null)
                produtosCarrinho = (List<ProdutoCarrinho>) carrinho;
            else
                produtosCarrinho = new ArrayList<ProdutoCarrinho>();

            Produto produto = produtoService.detalharProduto(idProduto);
            
            ProdutoCarrinho pc = null;
            Optional<ProdutoCarrinho> produtoCarrinho = produtosCarrinho
                    .stream()
                    .filter(p -> p.getProduto().getId() == idProduto)
                    .findFirst();
            if (produtoCarrinho.isPresent()) {
                pc = produtoCarrinho.get();
                pc.incrementarQuantidade();
            } else {
                pc = new ProdutoCarrinho(produto);
            }
            
            produtosCarrinho.add(pc);
        } catch (Exception ex) {
            Logger.getLogger(AdicionarCarrinho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
