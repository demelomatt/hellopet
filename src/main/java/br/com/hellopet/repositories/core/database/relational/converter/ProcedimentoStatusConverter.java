package br.com.hellopet.repositories.core.database.relational.converter;

import br.com.hellopet.domain.business.entity.enums.ProcedimentoStatus;
import jakarta.persistence.AttributeConverter;

public class ProcedimentoStatusConverter implements AttributeConverter<ProcedimentoStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ProcedimentoStatus status) {
        return status.getId();
    }

    @Override
    public ProcedimentoStatus convertToEntityAttribute(Integer id) {
        return ProcedimentoStatus.fromId(id);
    }
}
