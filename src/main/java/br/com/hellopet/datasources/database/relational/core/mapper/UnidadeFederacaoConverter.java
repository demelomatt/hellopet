package br.com.hellopet.datasources.database.relational.core.mapper;

import br.com.hellopet.entities.core.enums.UnidadeFederacao;
import jakarta.persistence.AttributeConverter;

public class UnidadeFederacaoConverter implements AttributeConverter<UnidadeFederacao, Integer> {

    @Override
    public Integer convertToDatabaseColumn(UnidadeFederacao uf) {
        return uf.getId();
    }

    @Override
    public UnidadeFederacao convertToEntityAttribute(Integer id) {
        return UnidadeFederacao.fromId(id);
    }
}
