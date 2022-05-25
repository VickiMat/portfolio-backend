
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Educacion;
import com.portfoliosb.MiBackEnd.service.IEducacionService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired
    private IEducacionService educacServ;
    
    
    @GetMapping ("/{idPersona}")
    @ResponseBody
    public List<Educacion> verEducacion(@PathVariable Long idPersona){
        return educacServ.verEducaciones(idPersona);
    }
    
    @PostMapping ("/crear")
    public void crearEducacion(@RequestBody Educacion educac){
        educacServ.crearEducacion(educac);
    }
    
    
    @DeleteMapping ("/eliminar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacServ.borrarEducacion(id);
    }
    
    @PutMapping("/editar/{id}")
    public void editarEducacion(@PathVariable Long id, @RequestBody Educacion educac){
        educacServ.editarEducacion(educac, id);
    }
    /* @PutMapping("/editar/{id}")
    public Educacion editarEducacion(@PathVariable Long id,
                                @RequestParam("nombre_titulo") String nuevoNombre_titulo,
                                @RequestParam("descripcion") String nuevoDescripcion,
                                @RequestParam("logo") String nuevoLogo,
                                @RequestParam("instituto") String nuevoInstituto,
                                @RequestParam("certificado") String nuevoCertificado,
                                @RequestParam("inicio") String nuevoInicio,
                                @RequestParam("fin") String nuevoFin){
                                                                       
        Educacion educacion = educacServ.buscarEducacion(id);
        educacion.setNombre_titulo(nuevoNombre_titulo);
        educacion.setDescripcion(nuevoDescripcion);
        educacion.setLogo(nuevoLogo);
        educacion.setInstituto(nuevoInstituto);
        educacion.setCertificado(nuevoCertificado);
        educacion.setInicio(Integer.SIZE);
        educacion.setFin(Integer.SIZE);
        
        educacServ.crearEducacion(educacion);
        return educacion;
    }*/
    
}
