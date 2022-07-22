
package com.portfoliosb.MiBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String img;
    private int anio;
    private String descripcion;
    private String url;

    

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String img, int anio, String descripcion, String url) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.anio = anio;
        this.descripcion = descripcion;
        this.url = url;
        
    }
    
    
    
}
