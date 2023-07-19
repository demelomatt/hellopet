package br.com.hellopet.datasources.database.relational.business.model;

import br.com.hellopet.datasources.database.relational.customer.model.PetModel;
import br.com.hellopet.datasources.database.relational.customer.model.TutorModel;
import br.com.hellopet.entities.business.enums.ProcedimentoStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PROCEDIMENTO_AGENDAMENTO")
public class ProcedimentoAgendamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "procedimento_id", referencedColumnName = "id", nullable = false)
    private ProcedimentoModel procedimento;

    @ManyToOne
    @JoinColumn(name = "veterinario_id", referencedColumnName = "id", nullable = false)
    private VeterinarioModel veterinario;

    @ManyToOne
    @JoinColumn(name = "pet_id", referencedColumnName = "id", nullable = false)
    private PetModel pet;

    @ManyToOne
    @JoinColumn(name = "tutor_id", referencedColumnName = "id", nullable = false)
    private TutorModel tutor;

    @Column(name = "procedimento_status_id", nullable = false)
    @Enumerated()
    private ProcedimentoStatus status;

    @Column(name = "horario_procedimento", nullable = false)
    private LocalDateTime horarioProcedimento;

    @Column(name = "valor", nullable = false)
    private BigDecimal valorTotal;
}