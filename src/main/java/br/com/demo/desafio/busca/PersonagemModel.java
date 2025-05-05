package br.com.demo.desafio.busca;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TBL_PERSONAGENS")
public record PersonagemModel(
    @Id
    Integer id,    
    String nome) {
}
