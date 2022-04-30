
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Proyecto;
import com.portfoliosb.MiBackEnd.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {
    
    @Autowired
    private ProyectoService proyecServ;
    
    @PostMapping ("/nuevo/proyecto")
    public void crearProyecto(@RequestBody Proyecto proyec){
        proyecServ.crearProyecto(proyec);
    }
    
    @GetMapping ("/mostrar/proyecto")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyecServ.verProyectos();
    }
    
    @DeleteMapping ("/eliminar/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyecServ.borrarProyecto(id);
    }
    
    @PutMapping ("/editar/proyecto/{id}")
    public void editarProyecto(@RequestBody Proyecto proyec){
        proyecServ.editarProyecto(proyec);
    }
    
    
}
