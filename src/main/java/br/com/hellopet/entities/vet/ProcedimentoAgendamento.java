package br.com.hellopet.entities.vet;

import br.com.hellopet.entities.pet.Pet;
import br.com.hellopet.entities.tutor.Tutor;
import br.com.hellopet.entities.vet.enums.ProcedimentoStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProcedimentoAgendamento(
        Procedimento procedimento,
        LocalDateTime horarioProcedimento,
        Veterinario veterinario,
        Pet pet,
        Tutor tutor,
        BigDecimal valorTotal,
        ProcedimentoStatus status
) {
}
