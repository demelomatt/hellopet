package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoCategoriaModel;
import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoGrupoModel;
import br.com.hellopet.datasources.database.relational.business.model.ProfissionalTipoModel;
import br.com.hellopet.datasources.database.relational.core.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.entities.business.ProcedimentoGrupo;
import org.mapstruct.Mapper;

@Mapper(uses = {
        ProcedimentoCategoriaRepositoryMapper.class,
        ProcedimentoTipoRepositoryMapper.class,
        ProfissionalRepositoryMapper.class
})
public interface ProcedimentoGrupoRepositoryMapper {
    ProcedimentoGrupoModel map(ProcedimentoGrupo procedimentoGrupo);
    ProcedimentoGrupo map(ProcedimentoGrupoModel procedimentoGrupoModel);
}
