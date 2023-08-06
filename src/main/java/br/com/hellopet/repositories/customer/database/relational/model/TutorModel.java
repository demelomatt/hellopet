package br.com.hellopet.repositories.customer.database.relational.model;

import br.com.hellopet.repositories.business.database.relational.model.EstabelecimentoModel;
import br.com.hellopet.repositories.business.database.relational.model.ProcedimentoAgendamentoModel;
import br.com.hellopet.repositories.core.database.relational.model.EnderecoModel;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name="tutor")
public class TutorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "celular")
    private String celular;

    @Embedded
    private EnderecoModel endereco;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;

    @Column(name = "ativo")
    private Boolean ativo;

    @OneToMany(mappedBy = "tutor")
    private List<ProcedimentoAgendamentoModel> agendamentos;

    @ManyToMany
    @JoinTable(name = "tutor_pet", joinColumns = @JoinColumn(name = "tutor_id"), inverseJoinColumns = @JoinColumn(name = "pet_id"))
    private List<PetModel> pets;

    @ManyToMany(mappedBy = "tutores")
    private List<EstabelecimentoModel> estabelecimentos;
}
