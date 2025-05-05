package br.com.demo.desafio.busca;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonagemService {

    private final PersonagemRepository repository;

    public PersonagemService(PersonagemRepository repository){
        this.repository = repository;
    }

    public List<PersonagemModel> getByNome(String name){
        return this.repository.findByNomeContainingIgnoreCase(name);
    }

    public List<PersonagemModel> findAll(){
        return this.repository.findAll();
    }
}
