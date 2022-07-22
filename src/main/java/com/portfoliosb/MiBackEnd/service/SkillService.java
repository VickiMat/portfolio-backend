
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Skill;
import com.portfoliosb.MiBackEnd.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    
    @Autowired
    public SkillRepository skiRepo;

    @Override
    public List<Skill> verSkills() {
        return skiRepo.findAll();
    }

    @Override
    public void crearSkill(Skill ski) {
       skiRepo.save(ski);
    }

    @Override
    public void borrarSkill(Long id) {
        skiRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skiRepo.findById(id).orElse(null);    }

    @Override
    public Skill editarSkill(Skill ski) {
        return skiRepo.save(ski);
    }
    
}
