
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Persona;
import com.portfoliosb.MiBackEnd.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService persoServ;
    
    @GetMapping("/personas/traer")
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @PostMapping("/personas/crear")
    public String crearPersona(@RequestBody Persona persona){
        persoServ.crearPersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editarpersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido,
                                @RequestParam("titulo") String nuevoTitulo){
                                                                       
        Persona persona = persoServ.buscarPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setTitulo(nuevoTitulo);
        
        persoServ.crearPersona(persona);
        return persona;
    }
    
    @PutMapping("/personas/editar/descripcion/{id}")
    public Persona editarDescripcion(@PathVariable Long id,                                         
                                @RequestParam("descripcion") String nuevoDescripcion){
        Persona persona = persoServ.buscarPersona(id);
        persona.setDescripcion(nuevoDescripcion);
        
        persoServ.crearPersona(persona);
        return persona;
    }
    
    @PutMapping("/personas/editar/imagen/{id}")
    public Persona editarImagen(@PathVariable Long id,                                         
                                @RequestParam("img") String nuevoImg){
        Persona persona = persoServ.buscarPersona(id);
        persona.setDescripcion(nuevoImg);
        
        persoServ.crearPersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil/{id}")
    public Persona traerPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
}
    
    
    

