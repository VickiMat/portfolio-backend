
package com.portfoliosb.MiBackEnd.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class About {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String url_imagen;

    public About() {
    }

    public About(int id, String nombre, String apellido, String titulo, String descripcion, String url_imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url_imagen = url_imagen;
    }
    
    
}
