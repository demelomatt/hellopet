package br.com.hellopet.api.rest.core.mapper;

import br.com.hellopet.api.rest.core.model.MunicipioResponse;
import br.com.hellopet.domain.core.entity.Municipio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MunicipioApiMapper {
    MunicipioApiMapper INSTANCE = Mappers.getMapper(MunicipioApiMapper.class);

    MunicipioResponse map(Municipio municipio);

    List<MunicipioResponse> map(List<Municipio> municipios);
}
