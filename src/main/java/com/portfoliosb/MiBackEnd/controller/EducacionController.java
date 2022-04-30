
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Educacion;
import com.portfoliosb.MiBackEnd.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService educacServ;
    
    @PostMapping ("/nuevo/educacion")
    public void crearEducacion(@RequestBody Educacion educac){
        educacServ.crearEducacion(educac);
    }
    
    @GetMapping ("/mostrar/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educacServ.verEducaciones();
    }
    
    @DeleteMapping ("/eliminar/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacServ.borrarEducacion(id);
    }
    
    @PutMapping ("/editar/educacion/{id}")
    public void editarDescripcion(@RequestBody Educacion educac){
        educacServ.editarEducacion(educac);
    }
    
    
}
