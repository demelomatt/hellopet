package br.com.hellopet.entities.core.enums;

import lombok.Getter;

@Getter
public enum DiaSemana {
    SEGUNDA(1, "Segunda"),
    TERCA(2, "Terça"),
    QUARTA(3,"Quarta"),
    QUINTA(4, "Quinta"),
    SEXTA(5, "Sexta"),
    SABADO(6, "Sábado"),
    DOMINGO(7, "Domingo");

    private final int id;
    private final String dia;

    DiaSemana(int id, String dia) {
        this.id = id;
        this.dia = dia;
    }

    public static DiaSemana fromId(int id) {
        for (DiaSemana dia : values()) {
            if (dia.getId() == id) {
                return dia;
            }
        }
        throw new IllegalArgumentException("Invalid Status id: " + id);
    }
}
