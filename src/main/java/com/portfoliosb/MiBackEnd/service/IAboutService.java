
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.About;
import java.util.List;


public interface IAboutService {
    
    public List<About> verDescripciones();
    public void crearAbout(About descrip);
    public void borrarAbout(Long id);
    public About buscarAbout(Long id);
    public void editarAbout(About descrip);
    
    
   // public void editarDatosPersonales(Long id);
   public void editarImagenPerfil(String url_imagen);
    
    
}
