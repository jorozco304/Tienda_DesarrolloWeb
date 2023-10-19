
package com.Tienda_DesarrolloWeb.service;

import com.Tienda_DesarrolloWeb.domian.Categoria;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface CategoriaService {
    //Retorna una lista de categorias (activas o todas)
    public List<Categoria> getCategorias(boolean activos);
    
    //retorna una categoria por id
    public Categoria getCategoria (Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
    
}
