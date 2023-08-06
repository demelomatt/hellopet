package br.com.hellopet.domain.business.entity;

import br.com.hellopet.domain.business.entity.enums.ProcedimentoStatus;
import br.com.hellopet.domain.customer.entity.Pet;
import br.com.hellopet.domain.customer.entity.Tutor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProcedimentoAgendamento {
    private Long id;
    private Procedimento procedimento;
    private Profissional profissional;
    private Pet pet;
    private Tutor tutor;
    private ProcedimentoStatus status;
    private LocalDateTime horarioProcedimento;
    private BigDecimal valorTotal;
}
