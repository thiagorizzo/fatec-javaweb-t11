/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Produto;

/**
 *
 * @author MAQLAB
 */
public class ProdutoRepository {
    ConexaoBD conexaoBD = ConexaoBD.getInstance();
    
    List<Produto> produtos = new ArrayList<Produto>();

    public ProdutoRepository() {

    }
    
    public Produto getById(int idProduto) {
        Produto produto = null;
        
        try {
            PreparedStatement ps = conexaoBD.getConnection().prepareStatement("SELECT * FROM produto WHERE id = ?");
            ps.setInt(1, idProduto);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                float preco = rs.getFloat("preco");
                
                produto = new Produto(id, nome, preco);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return produto;
    }

    public List<Produto> getAll() {
        List<Produto> produtos = new ArrayList<Produto>();
        
        try {
            PreparedStatement ps = conexaoBD.getConnection().prepareStatement("SELECT * FROM produto");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                float preco = rs.getFloat("preco");
                
                Produto produto = new Produto(id, nome, preco);
                
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return produtos;
    }
}
