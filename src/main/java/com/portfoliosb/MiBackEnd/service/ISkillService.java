
package com.portfoliosb.MiBackEnd.service;

import com.portfoliosb.MiBackEnd.model.Skill;
import java.util.List;


public interface ISkillService {
    public List<Skill> verSkills();
    public void crearSkill(Skill ski);
    public void borrarSkill(Long id);
    public Skill buscarSkill(Long id);
    public Skill editarSkill(Skill ski);
}
