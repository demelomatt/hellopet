package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProfissionalAusenciaModel;
import br.com.hellopet.entities.business.ProfissionalAusencia;
import org.mapstruct.Mapper;

@Mapper(uses = {ProfissionalRepositoryMapper.class})
public interface ProfissionalAusenciaRepositoryMapper {
    ProfissionalAusenciaModel map(ProfissionalAusencia profissionalAusencia);
    ProfissionalAusencia map(ProfissionalAusenciaModel profissionalAusenciaModel);

}
