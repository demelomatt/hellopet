package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoCategoriaModel;
import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoGrupoModel;
import br.com.hellopet.datasources.database.relational.core.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.entities.business.ProcedimentoCategoria;
import org.mapstruct.Mapper;

@Mapper(uses = {ProcedimentoGrupoRepositoryMapper.class})
public interface ProcedimentoCategoriaRepositoryMapper {
    ProcedimentoCategoriaModel map(ProcedimentoCategoria procedimentoCategoria);
    ProcedimentoCategoria map(ProcedimentoCategoriaModel procedimentoCategoriaModel);
}
