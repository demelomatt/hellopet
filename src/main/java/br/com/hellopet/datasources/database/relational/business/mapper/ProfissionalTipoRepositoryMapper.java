package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProfissionalTipoModel;
import br.com.hellopet.entities.business.ProfissionalTipo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfissionalTipoRepositoryMapper {
    ProfissionalTipoRepositoryMapper INSTANCE = Mappers.getMapper(ProfissionalTipoRepositoryMapper.class);

    ProfissionalTipoModel map(ProfissionalTipo profissionalTipo);

    ProfissionalTipo map(ProfissionalTipoModel profissionalTipoModel);
}
