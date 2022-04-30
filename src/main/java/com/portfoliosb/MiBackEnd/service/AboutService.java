
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.About;
import com.portfoliosb.MiBackEnd.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService {

    @Autowired 
    public AboutRepository descripRepo;
            
    @Override
    public List<About> verDescripciones() {
        return descripRepo.findAll();
    }

    @Override
    public void crearAbout(About descrip) {
        descripRepo.save(descrip);
    }

    @Override
    public void borrarAbout(Long id) {
        descripRepo.deleteById(id);
    }

    
   @Override
    public About buscarAbout(Long id) {
        return descripRepo.findById(id).orElse(null);
    }
   
    @Override
    public void editarAbout(About descrip) {
        descripRepo.save(descrip);
    }

/*
    @Override
    public void editarImagenPerfil(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarDatosPersonales(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
