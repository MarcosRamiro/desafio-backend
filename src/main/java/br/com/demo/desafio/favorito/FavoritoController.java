package br.com.demo.desafio.favorito;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/favorito")
public class FavoritoController {

    private final FavoritoService service;

    public FavoritoController() {
        this.service = new FavoritoService(new FavoritoRepository());
    }

    @GetMapping
    public ResponseEntity<?> handleRequest(
            @RequestBody(required = false) FavoritoRequest request,
            @RequestParam(value = "acao") String acao) {

        if (acao.equalsIgnoreCase("incluir")) {
            if (this.service.incluir(request)) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.status(HttpStatusCode.valueOf(500)).body("Já cadastrado");
        }

        if (acao.equalsIgnoreCase("remover")) {
            if (this.service.remover(request)) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.status(HttpStatusCode.valueOf(500)).body("Não cadastrado");
        }

        if (acao.equalsIgnoreCase("consultar")) {
            return ResponseEntity.ofNullable(this.service.findAll());
        }

        return null;
    }
}
