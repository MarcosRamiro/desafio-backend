package br.com.demo.desafio_qualidade.busca;

import java.util.List;

public class PersonagemService {

    private PersonagemRepository repository;

    public PersonagemService(PersonagemRepository repository){
        this.repository = repository;
    }

    public List<Personagem> getByName(String name){
        return this.repository.getByName(name);
    }

    public List<Personagem> findAll(){
        return this.repository.findAll();
    }
}
