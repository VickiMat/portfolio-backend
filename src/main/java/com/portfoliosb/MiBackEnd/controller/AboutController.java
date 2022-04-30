
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.About;
import com.portfoliosb.MiBackEnd.service.IAboutService;
import java.util.ArrayList;
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
public class AboutController {
    
    @Autowired
    private IAboutService descripServ;
    
    List<About> listaDescripciones = new ArrayList();
    
    @PostMapping ("/nuevo/about")
    public void crearDescripcion(@RequestBody About descrip){
        descripServ.crearAbout(descrip);
    }
    
    @GetMapping ("/mostrar/about")
    @ResponseBody
    public List<About> verDescripciones(){
        return descripServ.verDescripciones();
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public void borrarDescripcion(@PathVariable Long id){
        descripServ.borrarAbout(id);
    }
    
    @PutMapping ("/editar/descripcion")
    public void editarDescripcion(@RequestBody About descrip){
        descripServ.editarAbout(descrip);
    }
}
