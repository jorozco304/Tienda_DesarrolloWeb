
package com.Tienda_DesarrolloWeb.service;

import com.Tienda_DesarrolloWeb.domian.Categoria;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria (Categoria categoria);
    
}
