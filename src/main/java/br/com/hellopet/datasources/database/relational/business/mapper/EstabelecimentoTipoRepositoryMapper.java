package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.EstabelecimentoTipoModel;
import br.com.hellopet.entities.business.EstabelecimentoTipo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EstabelecimentoTipoRepositoryMapper {
    EstabelecimentoTipoRepositoryMapper INSTANCE = Mappers.getMapper(EstabelecimentoTipoRepositoryMapper.class);

    EstabelecimentoTipoModel map(EstabelecimentoTipo estabelecimentoTipo);

    EstabelecimentoTipo map(EstabelecimentoTipoModel estabelecimentoTipoModel);
}
