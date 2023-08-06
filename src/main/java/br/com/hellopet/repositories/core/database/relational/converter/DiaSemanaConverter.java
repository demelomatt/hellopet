package br.com.hellopet.repositories.core.database.relational.converter;

import br.com.hellopet.domain.core.entity.enums.DiaSemana;
import jakarta.persistence.AttributeConverter;

public class DiaSemanaConverter implements AttributeConverter<DiaSemana, Integer> {
    @Override
    public Integer convertToDatabaseColumn(DiaSemana diaSemana) {
        return diaSemana.getId();
    }

    @Override
    public DiaSemana convertToEntityAttribute(Integer id) {
        return DiaSemana.fromId(id);
    }
}
