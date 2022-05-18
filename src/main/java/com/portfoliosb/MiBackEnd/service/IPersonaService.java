
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Persona;
import java.util.List;


public interface IPersonaService {
    //traer lista de personas
    public List<Persona> verPersonas();
    
    //guardar un objeto de tipo persona
    public void crearPersona(Persona pers);
    
    //Eliminar un objeto tipo persona por ID
    public void borrarPersona(Long id);
    
    //Modificar un objeto tipo persona
    public void editarPersona(Long id);
    
    //Buscar una persona
    public Persona buscarPersona(Long id);
}
