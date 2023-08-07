package br.com.hellopet.repositories.business.database.relational.model;

import br.com.hellopet.repositories.core.database.relational.model.DiaSemanaModel;
import br.com.hellopet.repositories.core.database.relational.model.EnderecoModel;
import br.com.hellopet.repositories.customer.database.relational.model.TutorModel;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "estabelecimento")
public class EstabelecimentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estabelecimento_tipo_id", referencedColumnName = "id", nullable = false)
    private EstabelecimentoTipoModel estabelecimentoTipo;

    @Column(name = "cnpj", nullable = false, unique = true, length = 14)
    private String cnpj;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone", length = 12)
    private String telefone;

    @Column(name = "celular", length = 13)
    private String celular;

    @Column(name = "data_fundacao")
    private LocalDate dataFundacao;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;

    @Column(name = "horario_abertura", nullable = false)
    private LocalTime horarioAbertura;

    @Column(name = "horario_fechamento", nullable = false)
    private LocalTime horarioFechamento;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    @Embedded
    private EnderecoModel endereco;

    @OneToMany(mappedBy = "estabelecimento")
    private List<ProcedimentoModel> procedimentos;

    @ManyToMany
    @JoinTable(name = "estabelecimento_dia_semana", joinColumns = @JoinColumn(name = "estabelecimento_id"), inverseJoinColumns = @JoinColumn(name = "dia_semana_id"))
    private Set<DiaSemanaModel> diasFuncionamento;

    @ManyToMany
    @JoinTable(name = "estabelecimento_profissional", joinColumns = @JoinColumn(name = "estabelecimento_id"), inverseJoinColumns = @JoinColumn(name = "profissional_id"))
    private List<ProfissionalModel> profissionais;

    @ManyToMany
    @JoinTable(name = "estabelecimento_tutor", joinColumns = @JoinColumn(name = "estabelecimento_id"), inverseJoinColumns = @JoinColumn(name = "tutor_id"))
    private List<TutorModel> tutores;

}
