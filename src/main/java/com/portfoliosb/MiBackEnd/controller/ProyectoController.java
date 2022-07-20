
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Proyecto;
import com.portfoliosb.MiBackEnd.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    @Autowired
    private ProyectoService proyecServ;
    
    @PostMapping ("/crear")
    public void crearProyecto(@RequestBody Proyecto proyec){
        proyecServ.crearProyecto(proyec);
    }
    
    @GetMapping ("/mostrar")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyecServ.verProyectos();
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyecServ.borrarProyecto(id);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyec){
        Proyecto updateProyecto=proyecServ.editarProyecto(proyec);
        return new ResponseEntity<>(updateProyecto,HttpStatus.OK);
    }
    
    
}
