/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Categoria;
import models.Produto;

/**
 *
 * @author MAQ01LAB04
 */
public class CategoriaRepository {
    ConexaoBD conexaoBD;
    
    public CategoriaRepository() throws ClassNotFoundException, SQLException {
        conexaoBD = ConexaoBD.getInstance();
    }
    
    public Categoria getById(int idCategoria) throws SQLException {
        Connection connection = conexaoBD.getConnection();
        
        PreparedStatement ps = connection
                .prepareStatement("SELECT * FROM Categoria WHERE id = ?");
     
        return null;
    }
}
