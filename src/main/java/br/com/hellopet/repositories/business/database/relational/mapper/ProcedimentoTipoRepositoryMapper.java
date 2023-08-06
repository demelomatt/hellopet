package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.ProfissionalTipoModel;
import br.com.hellopet.domain.business.entity.ProfissionalTipo;
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
