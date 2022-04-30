
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> verEducaciones();
    public void crearEducacion(Educacion educac);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
    public void editarEducacion(Educacion educac);
}
