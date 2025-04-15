package br.com.demo.desafio_qualidade.busca;

import java.util.List;

public class PersonagemRepository {

    private final List<String> data =
            List.of("Luke Skywalker", "C-3PO", "R2-D2", "Darth Vader", "Leia Organa", "Owen Lars",
                    "Beru Whitesun lars", "R5-D4", "Biggs Darklighter", "Obi-Wan Kenobi", "Anakin Skywalker",
                    "Wilhuff Tarkin", "Chewbacca", "Han Solo", "Greedo", "Jabba Desilijic Tiure", "Wedge Antilles",
                    "Jek Tono Porkins", "Yoda", "Palpatine");

    public List<Personagem> getByName(String name) {
        return data
                .stream()
                .filter(p -> p.toLowerCase().contains(name.toLowerCase()))
                .map(Personagem::new)
                .toList();
    }

    public List<Personagem> findAll() {
        return this.data.stream().map(Personagem::new).toList();
    }

}
