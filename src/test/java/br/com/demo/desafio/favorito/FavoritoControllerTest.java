package br.com.demo.desafio.favorito;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;


public class FavoritoControllerTest {

    private FavoritoController controller;

    @BeforeEach
    public void setup(){
        this.controller = new FavoritoController();
    }

    @Test
    public void testHandleRequestIncluirSucesso() {

        FavoritoRequest request = new FavoritoRequest("Maria");
        
        ResponseEntity<?> response = controller.handleRequest(request, "incluir");
        

    }

    @Test
    public void testHandleRequestRemoverSucesso() {

        FavoritoRequest request = new FavoritoRequest("Maria");
        
        ResponseEntity<?> response = controller.handleRequest(request, "incluir");
        response = controller.handleRequest(request, "remover");

    }

    @Test
    public void testHandleRequestRemoverNaoCadastrado(){
        
        FavoritoRequest request = new FavoritoRequest("Maria");
        
        ResponseEntity<?> response = controller.handleRequest(request, "remover");
        
    }

    @Test
    public void testHandleRequestConsultarComResultados() {

        var mariaReq = new FavoritoRequest("Maria");
        var joaoReq = new FavoritoRequest("João");

        var mariaRes = new FavoritoResponse("Maria");
        var joaoRes = new FavoritoResponse("João");

        List<FavoritoResponse> favoritosResponse = Arrays.asList(mariaRes, joaoRes);
        
        controller.handleRequest(mariaReq, "incluir");
        controller.handleRequest(joaoReq, "incluir");

        ResponseEntity<?> response = controller.handleRequest(null, "consultar");
        
    }

    @Test
    void testHandleRequestAcaoInvalida() {

        ResponseEntity<?> response = controller.handleRequest(null, "acaoInvalida");
        
        assertNull(response);

    }



}
