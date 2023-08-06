package br.com.hellopet.repositories.business.database.relational.model;

import br.com.hellopet.repositories.core.database.relational.converter.ProcedimentoStatusConverter;
import br.com.hellopet.repositories.customer.database.relational.model.PetModel;
import br.com.hellopet.repositories.customer.database.relational.model.TutorModel;
import br.com.hellopet.domain.business.entity.enums.ProcedimentoStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "procedimento_agendamento")
public class ProcedimentoAgendamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "procedimento_id", referencedColumnName = "id", nullable = false)
    private ProcedimentoModel procedimento;

    @ManyToOne
    @JoinColumn(name = "profissional_id", referencedColumnName = "id", nullable = false)
    private ProfissionalModel profissional;

    @ManyToOne
    @JoinColumn(name = "pet_id", referencedColumnName = "id", nullable = false)
    private PetModel pet;

    @ManyToOne
    @JoinColumn(name = "tutor_id", referencedColumnName = "id", nullable = false)
    private TutorModel tutor;

    @Column(name = "procedimento_status_id", nullable = false)
    @Convert(converter = ProcedimentoStatusConverter.class)
    private ProcedimentoStatus status;

    @Column(name = "horario_procedimento", nullable = false)
    private LocalDateTime horarioProcedimento;

    @Column(name = "valor", nullable = false)
    private BigDecimal valorTotal;
}