
package com.portfoliosb.MiBackEnd.model;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class About {
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String url_imagen;

    public About() {
    }

    public About(Long id, String nombre, String apellido, String titulo, String descripcion, String url_imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url_imagen = url_imagen;
    }
    
    
}
