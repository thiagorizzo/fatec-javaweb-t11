/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import models.Produto;

/**
 *
 * @author MAQLAB
 */
public class ProdutoRepository {
    List<Produto> produtos = new ArrayList<Produto>();

    public ProdutoRepository() {
        produtos.add(new Produto(1, "caneta", 2.0f));
        produtos.add(new Produto(2, "lápis", 1.5f));
        produtos.add(new Produto(3, "régua", 1.5f));        
    }
    
    public List<Produto> getAll() {
        return produtos;
    }
}
