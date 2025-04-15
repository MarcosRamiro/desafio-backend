package br.com.demo.desafio_qualidade.busca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("personagem")
public class PersonagemController {

    private final PersonagemService service;

    public PersonagemController(){
        this.service = new PersonagemService(new PersonagemRepository());
    }

    @GetMapping
    public List<Personagem> get(@RequestParam(required = false) String name){
        if (name == null) {
            return this.service.findAll();
        } else {
            return this.service.getByName(name);
        }
    }
}
