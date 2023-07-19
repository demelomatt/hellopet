package br.com.hellopet.datasources.database.relational.business.model;

import br.com.hellopet.entities.business.enums.ProcedimentoCategoria;
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

    @Column(name = "categoria_id", nullable = false)
    @Enumerated
    private ProcedimentoCategoria categoria;

    @Column(name = "nome", nullable = false)
    private String nome;

    @OneToMany(mappedBy = "procedimentoTipo")
    private List<ProcedimentoModel> procedimentoTipos;

}
