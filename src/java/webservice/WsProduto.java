/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import controllers.interfaces.IProdutoService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import models.Produto;
import services.ProdutoService;

@Path("/wsproduto")
public class WsProduto {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //  localhost:8080/Produto
    public WsResponse getAll() {
        try {
            IProdutoService produtoService = new ProdutoService();
            List<Produto> produtos = produtoService.listarProdutos();
            return new WsResponse(produtos);
        } catch (Exception ex) {
            return new WsResponse(ex);
        }
    }

    /*@GET()
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    //  localhost:8080/Produto/2
    public WsResponse getByIdPath(@PathParam("id") int id) {
        try {
            Produto produto = getByIdCore(id);
            return new WsResponse(produto);
        } catch (Exception ex) {
            return new WsResponse(ex);
        }
    }
    
    @GET()
    //  localhost:8080/Produto?id=2
    public WsResponse getByIdQuery(@QueryParam("id") int id) {
        try {
            Produto produto = getByIdCore(id);
            return new WsResponse(produto);
        } catch (Exception ex) {
            return new WsResponse(ex);
        }
    }    
    
    private Produto getByIdCore(int id) throws Exception {
        IProdutoService produtoService = new ProdutoService();
        Produto produto = produtoService.detalharProduto(id);
        return produto;
    }
    
    @POST
    public WsResponse create() {
        return null;
    }*/
}
