package br.com.hellopet.datasources.database.relational.core.converter;

import br.com.hellopet.entities.core.enums.DiaSemana;
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
