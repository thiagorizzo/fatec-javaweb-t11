/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controllers.interfaces.IProdutoService;
import java.util.List;
import models.Produto;
import repository.ProdutoRepository;

/**
 *
 * @author MAQLAB
 */
public class ProdutoService implements IProdutoService {
    // Service dependendo do ProdutoRepository
    ProdutoRepository produtoRepository;
    
    public ProdutoService() throws Exception {
        produtoRepository = new ProdutoRepository();        
    }
    
    public List<Produto> listarProdutos() throws Exception {
        return produtoRepository.getAll();
    }
    
    public Produto detalharProduto(int id) throws Exception {
        return produtoRepository.getById(id);
    }

    @Override
    public Produto cadastrarProduto(Produto produto) throws Exception {
        return produtoRepository.insert(produto);
    }
}
