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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Categoria;
import services.CategoriaService;
import services.ProdutoService;

/**
 *
 * @author MAQ01LAB04
 */
@WebServlet(name = "FormProduto", urlPatterns = {"/FormProduto"})
public class FormProdutoController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ICategoriaService categoriaService = new CategoriaService();
            List<Categoria> categorias = categoriaService.listar();
            
            request.setAttribute("categorias", categorias);

            RequestDispatcher rd = request.getRequestDispatcher("Produto/FormularioProduto.jsp");
            rd.forward(request, response);
            
        } catch(Exception ex) {
            request.setAttribute("exception", ex);
            
            RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
            rd.forward(request, response);
            return;         
        } 
    }
}    

