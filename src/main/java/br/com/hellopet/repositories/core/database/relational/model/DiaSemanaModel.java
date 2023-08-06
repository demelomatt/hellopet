package br.com.hellopet.repositories.core.database.relational.model;

import br.com.hellopet.repositories.business.database.relational.model.EstabelecimentoModel;
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
