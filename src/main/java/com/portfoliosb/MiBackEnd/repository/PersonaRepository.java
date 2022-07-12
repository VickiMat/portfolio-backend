
package com.portfoliosb.MiBackEnd.repository;

import com.portfoliosb.MiBackEnd.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
}
