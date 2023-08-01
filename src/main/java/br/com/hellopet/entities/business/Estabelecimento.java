package br.com.hellopet.entities.business;

import br.com.hellopet.entities.core.Endereco;
import br.com.hellopet.entities.customer.Tutor;
import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Data
public class Estabelecimento {
    private Long id;
    private EstabelecimentoTipo estabelecimentoTipo;
    private String cnpj;
    private String nome;
    private Endereco endereco;
    private String email;
    private String telefone;
    private String celular;
    private LocalDate dataFundacao;
    private LocalDate dataCadastro;
    private LocalTime horarioAbertura;
    private LocalTime horarioFechamento;
    private Boolean ativo;
    private List<Procedimento> procedimentos;
    private Set<DayOfWeek> diasFuncionamento;
    private List<Profissional> profissionais;
    private List<Tutor> tutores;
}
