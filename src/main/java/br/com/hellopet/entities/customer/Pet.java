package br.com.hellopet.entities.customer;

import br.com.hellopet.entities.business.ProcedimentoAgendamento;
import br.com.hellopet.entities.core.enums.Genero;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

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
    private List<Tutor> tutores;
    private List<ProcedimentoAgendamento> agendamentos;
}