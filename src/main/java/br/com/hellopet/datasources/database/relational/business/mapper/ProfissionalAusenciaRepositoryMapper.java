package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProfissionalAusenciaModel;
import br.com.hellopet.entities.business.ProfissionalAusencia;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ProfissionalRepositoryMapper.class})
public interface ProfissionalAusenciaRepositoryMapper {
    ProfissionalAusenciaRepositoryMapper INSTANCE = Mappers.getMapper(ProfissionalAusenciaRepositoryMapper.class);

    ProfissionalAusenciaModel map(ProfissionalAusencia profissionalAusencia);

    ProfissionalAusencia map(ProfissionalAusenciaModel profissionalAusenciaModel);

}
