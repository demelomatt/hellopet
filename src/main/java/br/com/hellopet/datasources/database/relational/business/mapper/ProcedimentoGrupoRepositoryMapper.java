package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoGrupoModel;
import br.com.hellopet.entities.business.ProcedimentoGrupo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        ProcedimentoCategoriaRepositoryMapper.class,
        ProcedimentoTipoRepositoryMapper.class,
        ProfissionalRepositoryMapper.class
})
public interface ProcedimentoGrupoRepositoryMapper {
    ProcedimentoGrupoRepositoryMapper INSTANCE = Mappers.getMapper(ProcedimentoGrupoRepositoryMapper.class);

    ProcedimentoGrupoModel map(ProcedimentoGrupo procedimentoGrupo);

    ProcedimentoGrupo map(ProcedimentoGrupoModel procedimentoGrupoModel);
}
