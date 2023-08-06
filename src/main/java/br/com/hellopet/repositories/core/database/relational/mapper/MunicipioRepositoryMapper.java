package br.com.hellopet.repositories.core.database.relational.mapper;

import br.com.hellopet.repositories.core.database.relational.model.MunicipioModel;
import br.com.hellopet.domain.core.entity.Municipio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MunicipioRepositoryMapper {
    MunicipioRepositoryMapper INSTANCE = Mappers.getMapper(MunicipioRepositoryMapper.class);

    Municipio map(MunicipioModel municipioModel);
}
