
package com.portfoliosb.MiBackEnd.controller;

import com.portfoliosb.MiBackEnd.model.Skill;
import com.portfoliosb.MiBackEnd.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {
    
    @Autowired
    private ISkillService skiServ;
    
     @PostMapping ("/crear")
    public void crearSkill(@RequestBody Skill ski){
        skiServ.crearSkill(ski);
    }
    
    @GetMapping ("/mostrar")
    @ResponseBody
    public List<Skill> verSkills(){
        return skiServ.verSkills();
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public void borrarSkill(@PathVariable Long id){
        skiServ.borrarSkill(id);
    }
    
     @PutMapping("/editar")
    public ResponseEntity<Skill> editarSkill(@RequestBody Skill ski){
        Skill updateSkill=skiServ.editarSkill(ski);
        return new ResponseEntity<>(updateSkill,HttpStatus.OK);
    }
    
    
    
    
}
