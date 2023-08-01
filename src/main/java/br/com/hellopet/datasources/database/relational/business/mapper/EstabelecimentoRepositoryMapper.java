package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.EstabelecimentoModel;
import br.com.hellopet.datasources.database.relational.core.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.entities.business.Estabelecimento;
import org.mapstruct.Mapper;

@Mapper(uses = {EstabelecimentoTipoRepositoryMapper.class, EnderecoRepositoryMapper.class})
public interface EstabelecimentoRepositoryMapper {
    /*
    Estabelecimento map(EstabelecimentoModel estabelecimentoModel);
    EstabelecimentoModel map(Estabelecimento estabelecimento);

     */
}
