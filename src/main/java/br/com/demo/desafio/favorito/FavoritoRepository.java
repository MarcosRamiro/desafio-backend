package br.com.demo.desafio.favorito;

import java.util.ArrayList;
import java.util.List;

public class FavoritoRepository {

    private List<Favorito> data;

    public FavoritoRepository() {
        this.data = new ArrayList<>();
    }

    public void cadastrar(Favorito favorito) {
        this.data.add(favorito);
    }

    public boolean isPresent(Favorito favorito) {
        return this.data.stream().anyMatch(f -> f.equals(favorito));
    }

    public List<Favorito> findAll() {
        return this.data.stream().toList();
    }

    public void remover(Favorito favorito) {
        this.data = new ArrayList<>(this.data.stream()
                .filter(f -> !f.equals(favorito))
                .toList());
    }

}
