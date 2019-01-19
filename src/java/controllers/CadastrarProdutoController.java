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

/**
 *
 * @author MAQ01LAB04
 */
@WebServlet(name = "CadastrarProdutoController", urlPatterns = {"/CadastrarProduto"})
public class CadastrarProdutoController extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse reponse) {
        String nomeProduto = request.getParameter("nome");
        float precoProduto = Float.parseFloat(request.getParameter("preco"));
        int categoriaProduto = Integer.parseInt(request.getParameter("categoria"));
        
        //Produto produto = new Produto(nomeProduto, precoProduto, categoriaProduto);
    }
}
