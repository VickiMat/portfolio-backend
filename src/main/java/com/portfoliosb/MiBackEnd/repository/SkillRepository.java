
package com.portfoliosb.MiBackEnd.repository;

import com.portfoliosb.MiBackEnd.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{
    
}
