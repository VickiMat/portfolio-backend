
package com.portfoliosb.MiBackEnd.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre_titulo;
    private String descripcion;
    private String logo;
    private String instituto;
    private String certificado;
    private String inicio;
    private String fin;
    private Long id_pers;


    public Educacion() {
    }

    public Educacion(Long id, String nombre_titulo, String descripcion, String logo, String instituto, String certificado, String inicio, String fin, Long id_pers) {
        this.id = id;
        this.nombre_titulo = nombre_titulo;
        this.descripcion = descripcion;
        this.logo = logo;
        this.instituto = instituto;
        this.certificado = certificado;
        this.inicio = inicio;
        this.fin = fin;
        this.id_pers = id_pers;
    }

    
    
    
}
