
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Proyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfoliosb.MiBackEnd.repository.ProyectoRepository;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proyecRepo;

    @Override
    public List<Proyecto> verProyectos() {
        return proyecRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyec) {
        proyecRepo.save(proyec);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyecRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyecRepo.findById(id).orElse(null);
        
    }

    @Override
    public void editarProyecto(Proyecto proyec) {
        proyecRepo.save(proyec);
    }
    
}
