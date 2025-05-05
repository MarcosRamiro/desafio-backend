package br.com.demo.desafio.favorito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FavoritoServiceTest {

    private FavoritoService favoritoService;

    @BeforeEach
    public void setup(){
        this.favoritoService = new FavoritoService(new FavoritoRepository());
    }

    @Test
    public void testIncluirFavorito(){
        FavoritoRequest request = new FavoritoRequest("Maria");
        favoritoService.incluir(request);
    }

    @Test
    public void testRemoverFavorito(){
        FavoritoRequest request = new FavoritoRequest("Maria");
        favoritoService.remover(request);
    }

    @Test
    public void testFindAllFavoritos(){
        var favoritos = favoritoService.findAll();
    }

}