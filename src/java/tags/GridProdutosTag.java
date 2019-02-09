/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import controllers.interfaces.IProdutoService;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import models.Produto;
import services.ProdutoService;

public class GridProdutosTag extends SimpleTagSupport {

    // Atributo
    private List<Produto> produtos;
    
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public void doTag() throws IOException {
        try {
            JspWriter out = this.getJspContext().getOut();

            out.println("<table class='table table-stripped'>");
            out.println("<tr>");
            out.println("<th>Id</th>");
            out.println("<th>Nome</th>");
            out.println("<th>Preço</th>");
            out.println("<th>Categoria</th>");
            out.println("<th></th>");
            out.println("</tr>");  
            
            for(Produto p : produtos) 
            {
               out.println("<tr>"); 
               out.println("<td>" + p.getId() + "</td>");
               out.println("<td>" + p.getNome() + "</td>");
               out.println("<td>" + p.getPreco() + "</td>");
               out.println("<td>" + p.getCategoria().getNome() + "</td>");
               out.println("</tr>");
            }
            
            out.println("</table>");
        } catch (Exception ex) {
            Logger.getLogger(GridProdutosTag.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
