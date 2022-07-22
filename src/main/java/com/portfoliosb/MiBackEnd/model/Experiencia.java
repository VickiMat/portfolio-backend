
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
public class Experiencia {
    
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String posicion;
    private String compania;
    private String url_img;
    private String modo;
    private String inicio;
    private String fin;
    private String lugar;
    private String descripcion;
        
    

    public Experiencia() {
    }

    public Experiencia(Long id, String posicion, String compania, String url_img, String modo, String inicio, String fin, String lugar, String descripcion) {
        this.id = id;
        this.posicion = posicion;
        this.compania = compania;
        this.url_img = url_img;
        this.modo = modo;
        this.inicio = inicio;
        this.fin = fin;
        this.lugar = lugar;
        this.descripcion = descripcion;
        
    }
    
    
}
