
package com.Tienda_DesarrolloWeb.dao;

import com.Tienda_DesarrolloWeb.domian.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */

public interface CategoriaDao extends JpaRepository<Categoria,Long> {
    
}
