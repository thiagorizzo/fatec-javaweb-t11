/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.interfaces.IUsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Usuario;
import services.UsuarioService;

@WebServlet(name = "AutenticarUsuarioController", urlPatterns = {"/AutenticarUsuario"})
public class AutenticarUsuarioController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try 
        {
            IUsuarioService usuarioService = new UsuarioService();

            String nome = request.getParameter("nome");
            String senha = request.getParameter("senha");
            
            Usuario usuario = usuarioService.verificar(nome, senha);
            if (usuario == null) {
                request.setAttribute("erroLogin", "Usuário ou senha inválidos.");
                RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
                rd.forward(request, response);
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("usuarioAutenticado", usuario);
                response.sendRedirect("/ProjetoWeb/ListarProduto");
            }
        } catch(Exception ex) {
            request.setAttribute("exception", ex);
            
            RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
            rd.forward(request, response);
        }   
    }
}
