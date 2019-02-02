/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.interfaces.IUsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.UsuarioService;

@WebServlet(name = "AutenticarUsuarioController", urlPatterns = {"/AutenticarUsuario"})
public class AutenticarUsuarioController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse reponse) 
    {
        /*IUsuarioService usuarioService = new UsuarioService();
        
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");*/
        
        
    }
}
