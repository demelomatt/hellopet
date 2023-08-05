package br.com.hellopet.datasources.database.relational.core.converter;

import br.com.hellopet.entities.business.enums.ProcedimentoStatus;
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
