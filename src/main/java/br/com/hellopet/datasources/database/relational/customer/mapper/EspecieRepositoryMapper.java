package br.com.hellopet.datasources.database.relational.customer.mapper;

import br.com.hellopet.datasources.database.relational.core.mapper.MunicipioRepositoryMapper;
import br.com.hellopet.datasources.database.relational.customer.model.EspecieModel;
import br.com.hellopet.entities.customer.Especie;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EspecieRepositoryMapper {
    EspecieRepositoryMapper INSTANCE = Mappers.getMapper(EspecieRepositoryMapper.class);

    @Mapping(target = "profissionais", ignore = true)
    EspecieModel map(Especie especie);

    @InheritInverseConfiguration
    Especie map(EspecieModel especieModel);
}
