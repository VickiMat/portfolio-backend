
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Skill;
import com.portfoliosb.MiBackEnd.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    
    @Autowired
    private ISkillService skiServ;
    
     @PostMapping ("/nuevo/skill")
    public void crearSkill(@RequestBody Skill ski){
        skiServ.crearSkill(ski);
    }
    
    @GetMapping ("/mostrar/skills")
    @ResponseBody
    public List<Skill> verSkills(){
        return skiServ.verSkills();
    }
    
    @DeleteMapping ("/eliminar/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
        skiServ.borrarSkill(id);
    }
    
    @PutMapping ("/editar/skill/{id}")
    public void editarDescripcion(@RequestBody Skill ski){
        skiServ.editarSkill(ski);
    }
    
    
    
}