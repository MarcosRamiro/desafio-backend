package br.com.demo.desafio.favorito;

import java.util.List;


public class FavoritoService {

    private final FavoritoRepository repository;

    public FavoritoService(FavoritoRepository repository) {
        this.repository = repository;
    }

    public Boolean incluir(FavoritoRequest request) {
        this.repository.cadastrar(new Favorito(request.name()));
        return true;
    }

    public Boolean remover(FavoritoRequest request) {
        if (!this.repository.isPresent(new Favorito(request.name()))) {
            return false;
        }

        this.repository.remover(new Favorito(request.name()));
        return true;
    }

    public List<FavoritoResponse> findAll() {
        return repository
                .findAll()
                .stream()
                .map(f -> new FavoritoResponse(f.name()))
                .toList();
    }

}
