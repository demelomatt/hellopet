package br.com.hellopet.datasources.database.relational.business.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "PROCEDIMENTO")
public class ProcedimentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "procedimento_tipo_id", referencedColumnName = "id", nullable = false)
    private ProcedimentoTipoModel procedimentoTipo;

    @ManyToOne
    @JoinColumn(name = "estabelecimento_id", referencedColumnName = "id", nullable = false)
    private EstabelecimentoModel estabelecimento;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @Column(name = "duracao_minutos", nullable = false)
    private Integer duracaoMinutos;

    @OneToMany(mappedBy = "procedimento")
    private List<ProcedimentoAgendamentoModel> agendamentos;
}
