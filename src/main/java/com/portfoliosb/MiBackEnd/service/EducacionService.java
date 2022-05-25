
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Educacion;
import com.portfoliosb.MiBackEnd.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    
    @Autowired 
    public EducacionRepository educacRepo;
    
    @Override
    public List<Educacion> verEducaciones(Long idPersona) {
        return educacRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educac) {
        educacRepo.save(educac);
    }

    @Override
    public void borrarEducacion(Long id) {
        educacRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educacRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion educac, Long id) {
        educacRepo.save(educac);
    }


    
    
}
