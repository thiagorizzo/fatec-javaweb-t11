/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controllers.interfaces.ICategoriaService;
import models.Categoria;
import repository.CategoriaRepository;

/**
 *
 * @author MAQ01LAB04
 */
public class CategoriaService implements ICategoriaService {
    
    CategoriaRepository categoriaRepository;
    
    public CategoriaService() throws Exception {
        categoriaRepository = new CategoriaRepository();
    }
    
    @Override
    public Categoria buscarPeloId(int idCategoria) throws Exception {
        return categoriaRepository.getById(idCategoria);
    }
}
