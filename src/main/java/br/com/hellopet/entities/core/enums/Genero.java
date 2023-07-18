package br.com.hellopet.entities.core.enums;

import lombok.Getter;

@Getter
public enum Genero {
    MACHO(0),
    FEMEA(1);

    private final int id;

    private Genero(int id) {
        this.id = id;
    }
}
