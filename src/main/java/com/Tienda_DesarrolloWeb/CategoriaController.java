
package com.Tienda_DesarrolloWeb;

import com.Tienda_DesarrolloWeb.domian.Categoria;
import com.Tienda_DesarrolloWeb.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Categoria> listadoCategorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", listadoCategorias);
        model.addAttribute("totalCategorias", listadoCategorias.size());
        
        return "/categoria/listado";
    }
    
}
