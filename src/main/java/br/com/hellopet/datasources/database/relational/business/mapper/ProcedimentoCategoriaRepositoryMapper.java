package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoCategoriaModel;
import br.com.hellopet.entities.business.ProcedimentoCategoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ProcedimentoGrupoRepositoryMapper.class})
public interface ProcedimentoCategoriaRepositoryMapper {
    ProcedimentoCategoriaRepositoryMapper INSTANCE = Mappers.getMapper(ProcedimentoCategoriaRepositoryMapper.class);

    ProcedimentoCategoriaModel map(ProcedimentoCategoria procedimentoCategoria);

    ProcedimentoCategoria map(ProcedimentoCategoriaModel procedimentoCategoriaModel);
}
