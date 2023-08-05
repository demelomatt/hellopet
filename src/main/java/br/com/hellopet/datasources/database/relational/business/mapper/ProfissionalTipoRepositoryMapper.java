package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProfissionalTipoModel;
import br.com.hellopet.entities.business.ProfissionalTipo;
import org.mapstruct.Mapper;

@Mapper
public interface ProfissionalTipoRepositoryMapper {
    ProfissionalTipoModel map(ProfissionalTipo profissionalTipo);
    ProfissionalTipo map(ProfissionalTipoModel profissionalTipoModel);
}
