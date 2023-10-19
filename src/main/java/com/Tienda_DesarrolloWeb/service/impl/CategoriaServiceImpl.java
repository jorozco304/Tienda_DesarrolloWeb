
package com.Tienda_DesarrolloWeb.service.impl;

import com.Tienda_DesarrolloWeb.dao.CategoriaDao;
import com.Tienda_DesarrolloWeb.domian.Categoria;
import com.Tienda_DesarrolloWeb.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> categorias = categoriaDao.findAll();
        
        if(activos){
            categorias.removeIf(c -> !c.isActivo());
        }
        
        return categorias;        
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
     
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }
    
     @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }
    
}
