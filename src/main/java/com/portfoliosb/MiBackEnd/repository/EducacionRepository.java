
package com.portfoliosb.MiBackEnd.repository;

import com.portfoliosb.MiBackEnd.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion,Long>{

    public void deleteById(int id);

    public Object findById(int id);
    
}
