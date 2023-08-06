package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.ProfissionalTipoModel;
import br.com.hellopet.domain.business.entity.ProfissionalTipo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfissionalTipoRepositoryMapper {
    ProfissionalTipoRepositoryMapper INSTANCE = Mappers.getMapper(ProfissionalTipoRepositoryMapper.class);

    ProfissionalTipoModel map(ProfissionalTipo profissionalTipo);

    ProfissionalTipo map(ProfissionalTipoModel profissionalTipoModel);
}
