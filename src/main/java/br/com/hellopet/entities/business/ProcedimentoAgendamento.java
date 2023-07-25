package br.com.hellopet.entities.business;

import br.com.hellopet.entities.business.enums.ProcedimentoStatus;
import br.com.hellopet.entities.customer.Pet;
import br.com.hellopet.entities.customer.Tutor;
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
