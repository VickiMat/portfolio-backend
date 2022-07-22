
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public void crearExperiencia(Experiencia exper);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
    public Experiencia editarExperiencia(Experiencia exper);
}
