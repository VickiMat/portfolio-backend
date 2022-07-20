
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Experiencia;
import com.portfoliosb.MiBackEnd.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository experRepo;

    @Override
    public List<Experiencia> verExperiencias() {
        return experRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exper) {
        experRepo.save(exper);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return experRepo.findById(id).orElse(null);
    }

    @Override
    public Experiencia editarExperiencia(Experiencia exper) {
        return experRepo.save(exper);
    }
    
}
