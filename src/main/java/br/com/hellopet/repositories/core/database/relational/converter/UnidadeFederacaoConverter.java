package br.com.hellopet.repositories.core.database.relational.converter;

import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import jakarta.persistence.AttributeConverter;

public class UnidadeFederacaoConverter implements AttributeConverter<UnidadeFederacao, Integer> {

    @Override
    public Integer convertToDatabaseColumn(UnidadeFederacao uf) {
        if (uf == null) {
            return null;
        }
        return uf.getId();
    }

    @Override
    public UnidadeFederacao convertToEntityAttribute(Integer id) {
        if (id == null ){
            return null;
        }
        return UnidadeFederacao.fromId(id);
    }
}
