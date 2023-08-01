package br.com.hellopet.datasources.database.relational.core.model;

import br.com.hellopet.datasources.database.relational.business.model.EstabelecimentoModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "dia_semana")
public class DiaSemanaModel {
    @Id
    private Long id;

    @Column(name = "dia", nullable = false, unique = true)
    private String dia;

    @ManyToMany(mappedBy = "diasFuncionamento")
    private List<EstabelecimentoModel> estabelecimentos;
}
