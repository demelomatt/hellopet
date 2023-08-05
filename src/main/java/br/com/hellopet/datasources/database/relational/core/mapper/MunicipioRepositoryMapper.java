package br.com.hellopet.datasources.database.relational.core.mapper;

import br.com.hellopet.datasources.database.relational.core.model.MunicipioModel;
import br.com.hellopet.entities.core.Municipio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MunicipioRepositoryMapper {
    MunicipioRepositoryMapper INSTANCE = Mappers.getMapper(MunicipioRepositoryMapper.class);

    Municipio map(MunicipioModel municipioModel);

    List<Municipio> map(List<MunicipioModel> municipiosModel);
}
