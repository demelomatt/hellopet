package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.ProcedimentoCategoriaModel;
import br.com.hellopet.domain.business.entity.ProcedimentoCategoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ProcedimentoGrupoRepositoryMapper.class})
public interface ProcedimentoCategoriaRepositoryMapper {
    ProcedimentoCategoriaRepositoryMapper INSTANCE = Mappers.getMapper(ProcedimentoCategoriaRepositoryMapper.class);

    ProcedimentoCategoriaModel map(ProcedimentoCategoria procedimentoCategoria);

    ProcedimentoCategoria map(ProcedimentoCategoriaModel procedimentoCategoriaModel);
}
