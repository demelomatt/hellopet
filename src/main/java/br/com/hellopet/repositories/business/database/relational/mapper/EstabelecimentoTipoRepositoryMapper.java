package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.EstabelecimentoTipoModel;
import br.com.hellopet.domain.business.entity.EstabelecimentoTipo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EstabelecimentoTipoRepositoryMapper {
    EstabelecimentoTipoRepositoryMapper INSTANCE = Mappers.getMapper(EstabelecimentoTipoRepositoryMapper.class);

    EstabelecimentoTipoModel map(EstabelecimentoTipo estabelecimentoTipo);

    EstabelecimentoTipo map(EstabelecimentoTipoModel estabelecimentoTipoModel);
}
