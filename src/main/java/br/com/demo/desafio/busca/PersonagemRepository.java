package br.com.demo.desafio.busca;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends ListCrudRepository<PersonagemModel, Integer> { 

    public List<PersonagemModel> findByNomeContainingIgnoreCase(String nome);

}
