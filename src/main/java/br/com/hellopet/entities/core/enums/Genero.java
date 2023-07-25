package br.com.hellopet.entities.core.enums;

import lombok.Getter;

@Getter
public enum Genero {
    MACHO(1),
    FEMEA(2);

    private final int id;

    private Genero(int id) {
        this.id = id;
    }
}
