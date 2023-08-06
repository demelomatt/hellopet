package br.com.hellopet.repositories.customer.database.relational.mapper;

import br.com.hellopet.repositories.customer.database.relational.model.EspecieModel;
import br.com.hellopet.domain.customer.entity.Especie;
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
