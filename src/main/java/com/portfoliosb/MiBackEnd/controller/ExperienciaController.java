
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Experiencia;
import com.portfoliosb.MiBackEnd.service.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService experServ;
    
     @PostMapping ("/nuevo/experiencia")
    public void crearExperiencia(@RequestBody Experiencia exper){
        experServ.crearExperiencia(exper);
    }
    
    @GetMapping ("/mostrar/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return experServ.verExperiencias();
    }
    
    @DeleteMapping ("/eliminar/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experServ.borrarExperiencia(id);
    }
    
    @PutMapping ("/editar/experiencia/{id}")
    public void editarExperiencia(@RequestBody Experiencia exper){
        experServ.editarExperiencia(exper);
    }
}