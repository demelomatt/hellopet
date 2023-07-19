package br.com.hellopet.entities.customer;

import br.com.hellopet.entities.core.enums.Genero;
import br.com.hellopet.entities.customer.enums.Especie;
import lombok.Data;

import java.time.LocalDate;

@Data
public final class Pet {
    private Long id;
    private String numeroIdentificacao;
    private Especie especie;
    private String nome;
    private Genero genero;
    private LocalDate dataNascimento;
    private Double peso;
    private Boolean castrado;
    private Boolean ativo;
}