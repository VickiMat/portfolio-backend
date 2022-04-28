
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.About;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AboutController {
    
    List<About> listaDescripciones = new ArrayList();
    
    @PostMapping ("/nuevo/about")
    public void agregarDescripcion(@RequestBody About descrip){
        listaDescripciones.add(descrip);
    }
    
    @GetMapping ("/mostrar/about")
    @ResponseBody
    public List<About> mostrarDescripcion(){
        return listaDescripciones;
    }
    
}
