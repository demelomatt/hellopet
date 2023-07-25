package br.com.hellopet.datasources.database.relational.business.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="PROCEDIMENTO_CATEGORIA")
public class ProcedimentoCategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @OneToMany(mappedBy = "categoria")
    private List<ProcedimentoGrupoModel> procedimentoGrupos;
}
