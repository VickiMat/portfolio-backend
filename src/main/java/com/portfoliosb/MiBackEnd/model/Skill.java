
package com.portfoliosb.MiBackEnd.model;

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
public class Skill {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int porcentaje;
    
    @ManyToOne()
    @JoinColumn(name = "id_persona")
    private About persona;

    public Skill() {
    }

    public Skill(Long id, String nombre, int porcentaje, About persona) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.persona = persona;
    }
    
    
}
