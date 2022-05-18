
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Persona;
import com.portfoliosb.MiBackEnd.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    @Autowired PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        List<Persona> persona = persoRepo.findAll();
        return persona;
    }

    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona persona = persoRepo.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void editarPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
