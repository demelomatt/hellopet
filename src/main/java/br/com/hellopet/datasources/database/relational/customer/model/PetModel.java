package br.com.hellopet.datasources.database.relational.customer.model;

import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoAgendamentoModel;
import br.com.hellopet.entities.core.enums.Genero;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name="pet")
public class PetModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_identificacao", unique = true)
    private String numeroIdentificacao;

    @ManyToOne
    @JoinColumn(name = "especie_id", referencedColumnName = "id", nullable = false)
    private EspecieModel especie;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "genero_id", nullable = false)
    @Enumerated()
    private Genero genero;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "castrado")
    private Boolean castrado;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    @OneToMany(mappedBy = "pet")
    private List<ProcedimentoAgendamentoModel> agendamentos;

    @ManyToMany(mappedBy = "pets")
    private List<TutorModel> tutores;
}

