package br.com.hellopet.entities.customer.enums;

import lombok.Getter;

@Getter
public enum Especie {
    CACHORRO(0),
    GATO(1),
    PORCO_INDIA(2);

    private final int id;

    private Especie(int id) {
        this.id = id;
    }
}
