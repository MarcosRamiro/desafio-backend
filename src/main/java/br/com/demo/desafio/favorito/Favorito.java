package br.com.demo.desafio.favorito;

import java.util.Objects;

public record Favorito(String name) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Favorito favorito = (Favorito) o;
        return Objects.equals(name, favorito.name);
    }

}
