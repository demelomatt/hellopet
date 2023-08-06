package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.ProfissionalAusenciaModel;
import br.com.hellopet.domain.business.entity.ProfissionalAusencia;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ProfissionalRepositoryMapper.class})
public interface ProfissionalAusenciaRepositoryMapper {
    ProfissionalAusenciaRepositoryMapper INSTANCE = Mappers.getMapper(ProfissionalAusenciaRepositoryMapper.class);

    ProfissionalAusenciaModel map(ProfissionalAusencia profissionalAusencia);

    ProfissionalAusencia map(ProfissionalAusenciaModel profissionalAusenciaModel);

}
