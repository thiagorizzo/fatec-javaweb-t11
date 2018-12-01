/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.Produto;
import repository.ProdutoRepository;

/**
 *
 * @author MAQLAB
 */
public class ProdutoService {
    // Service dependendo do ProdutoRepository
    ProdutoRepository produtoRepository = new ProdutoRepository();
    
    public List<Produto> ListarProdutos() {
        return produtoRepository.getAll();
    }
}
