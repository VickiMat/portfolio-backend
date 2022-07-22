
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Experiencia;
import com.portfoliosb.MiBackEnd.service.IExperienciaService;
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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    
    private IExperienciaService experServ;
    
     @PostMapping ("/crear")
    public void crearExperiencia(@RequestBody Experiencia exper){
        experServ.crearExperiencia(exper);
    }
    
    @GetMapping ("/mostrar")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return experServ.verExperiencias();
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experServ.borrarExperiencia(id);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia exper){
        Experiencia updateExperiencia=experServ.editarExperiencia(exper);
        return new ResponseEntity<>(updateExperiencia,HttpStatus.OK);
    }
}
