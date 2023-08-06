package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.ProcedimentoGrupoModel;
import br.com.hellopet.domain.business.entity.ProcedimentoGrupo;
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
