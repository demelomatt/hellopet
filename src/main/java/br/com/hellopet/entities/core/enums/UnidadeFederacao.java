package br.com.hellopet.entities.core.enums;

import lombok.Getter;

@Getter
public enum UnidadeFederacao {
    OTHER("OTHER", 99),
    AC("Acre", 1),
    AL("Alagoas", 2),
    AP("Amapá", 3),
    AM("Amazonas", 4),
    BA("Bahia", 5),
    CE("Ceará", 6),
    DF("Distrito Federal", 7),
    ES("Espírito Santo", 8),
    GO("Goiás", 9),
    MA("Maranhão", 10),
    MT("Mato Grosso", 11),
    MS("Mato Grosso do Sul", 12),
    MG("Minas Gerais", 13),
    PA("Pará", 14),
    PB("Paraíba", 15),
    PR("Paraná", 16),
    PE("Pernambuco", 17),
    PI("Piauí", 18),
    RJ("Rio de Janeiro", 19),
    RN("Rio Grande do Norte", 20),
    RO("Rondônia", 21),
    RS("Rio Grande do Sul", 22),
    RR("Roraima", 23),
    SC("Santa Catarina", 24),
    SE("Sergipe", 25),
    SP("São Paulo", 26),
    TO("Tocantins", 27);

    private final String nome;
    private final int id;

    UnidadeFederacao(String nome, Integer id ) {
        this.nome = nome;
        this.id = id;
    }

    public static UnidadeFederacao fromId(int id) {
        for (UnidadeFederacao uf : values()) {
            if (uf.getId() == id) {
                return uf;
            }
        }
        throw new IllegalArgumentException("Invalid Status id: " + id);
    }
}
