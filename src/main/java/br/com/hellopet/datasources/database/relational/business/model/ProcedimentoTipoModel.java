package br.com.hellopet.datasources.database.relational.business.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "PROCEDIMENTO_TIPO")
public class ProcedimentoTipoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "procedimento_grupo_id", referencedColumnName = "id", nullable = false)
    private ProcedimentoGrupoModel grupo;

    @OneToMany(mappedBy = "procedimentoTipo")
    private List<ProcedimentoModel> procedimentos;

}
