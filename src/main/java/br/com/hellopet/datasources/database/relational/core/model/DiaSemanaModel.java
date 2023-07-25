package br.com.hellopet.datasources.database.relational.core.model;

import br.com.hellopet.datasources.database.relational.business.model.EstabelecimentoModel;
import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.util.List;

@Data
@Entity
@Table(name = "DIA_SEMANA")
public class DiaSemanaModel {
    @Id
    @Enumerated
    private DayOfWeek id;

    @Column(name = "dia", nullable = false, unique = true)
    @Enumerated(value = EnumType.STRING)
    private DayOfWeek dia;

    @ManyToMany(mappedBy = "diasFuncionamento")
    private List<EstabelecimentoModel> estabelecimentos;
}
