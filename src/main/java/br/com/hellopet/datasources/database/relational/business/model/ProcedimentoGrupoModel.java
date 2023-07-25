package br.com.hellopet.datasources.database.relational.business.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "PROCEDIMENTO_GRUPO")
public class ProcedimentoGrupoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "grupo", nullable = false)
    private String grupo;

    @ManyToOne
    @JoinColumn(name = "procedimento_categoria_id", referencedColumnName = "id", nullable = false)
    private ProcedimentoCategoriaModel categoria;

    @OneToMany(mappedBy = "grupo")
    private List<ProcedimentoTipoModel> procedimentoTipos;

    @ManyToMany(mappedBy = "procedimentoGrupos")
    private List<ProfissionalModel> profissionais;

}
