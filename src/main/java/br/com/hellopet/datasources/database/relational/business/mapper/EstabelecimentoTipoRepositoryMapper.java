package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.EstabelecimentoTipoModel;
import br.com.hellopet.entities.business.EstabelecimentoTipo;
import org.mapstruct.Mapper;

@Mapper
public interface EstabelecimentoTipoRepositoryMapper {
    EstabelecimentoTipoModel map(EstabelecimentoTipo estabelecimentoTipo);
    EstabelecimentoTipo map(EstabelecimentoTipoModel estabelecimentoTipoModel);

}
