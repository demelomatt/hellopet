package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoCategoriaModel;
import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoGrupoModel;
import br.com.hellopet.datasources.database.relational.business.model.ProfissionalTipoModel;
import br.com.hellopet.datasources.database.relational.core.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.entities.business.ProcedimentoGrupo;
import org.mapstruct.Mapper;

@Mapper(uses = {ProcedimentoCategoriaModel.class, ProfissionalTipoModel.class})
public interface ProcedimentoGrupoRepositoryMapper {
    /*
    ProcedimentoGrupo map(ProcedimentoGrupoModel procedimentoGrupoModel);
    ProcedimentoGrupoModel map(ProcedimentoGrupo procedimentoGrupo);

     */
}
