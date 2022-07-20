
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto> verProyectos();
    public void crearProyecto(Proyecto proyec);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);
    public Proyecto editarProyecto(Proyecto proyec);
}
