
package com.portfoliosb.MiBackEnd.repository;

import com.portfoliosb.MiBackEnd.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository <About,Long>{
    
    
}
