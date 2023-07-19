package br.com.hellopet.entities.customer;

import br.com.hellopet.entities.core.Endereco;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Tutor {
    private Long id;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private String celular;
    private Endereco endereco;
    private LocalDate dataCadastro;
    private Boolean ativo;
}
