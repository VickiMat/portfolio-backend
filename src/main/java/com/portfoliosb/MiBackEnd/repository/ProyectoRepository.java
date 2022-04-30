
package com.portfoliosb.MiBackEnd.repository;

import com.portfoliosb.MiBackEnd.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
    
}
