/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.interfaces;

import java.util.List;
import models.Produto;

/**
 *
 * @author MAQLAB
 */
public interface IProdutoService {
    List<Produto> listarProdutos() throws Exception;
    Produto detalharProduto(int id) throws Exception;
    Produto cadastrarProduto(Produto produto) throws Exception;
}
