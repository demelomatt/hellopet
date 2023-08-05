package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProfissionalTipoModel;
import br.com.hellopet.entities.business.ProfissionalTipo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        ProcedimentoGrupoRepositoryMapper.class,
        ProcedimentoRepositoryMapper.class
})
public interface ProcedimentoTipoRepositoryMapper {
    ProcedimentoTipoRepositoryMapper INSTANCE = Mappers.getMapper(ProcedimentoTipoRepositoryMapper.class);

    ProfissionalTipoModel map(ProfissionalTipo profissionalTipo);

    ProfissionalTipo map(ProfissionalTipoModel profissionalTipoModel);
}
