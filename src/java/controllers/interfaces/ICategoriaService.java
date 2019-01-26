/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.interfaces;

import models.Categoria;

/**
 *
 * @author MAQ01LAB04
 */
public interface ICategoriaService {
    Categoria buscarPeloId(int idCategoria) throws Exception;
}
