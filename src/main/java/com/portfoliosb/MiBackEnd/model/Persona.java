package com.portfoliosb.MiBackEnd.model;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull 
    private String nombre;
    @NotNull 
    private String apellido;
    private String titulo;
    @NotNull
    private String descripcion;
    private String img;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String descripcion, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
    }
    
    
}


