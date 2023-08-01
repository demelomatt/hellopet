package br.com.hellopet.datasources.database.relational.customer.mapper;

import br.com.hellopet.datasources.database.relational.customer.model.EspecieModel;
import br.com.hellopet.entities.customer.Especie;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EspecieRepositoryMapper {

    @Mapping(target = "profissionais", ignore = true)
    EspecieModel map(Especie especie);

    @InheritInverseConfiguration
    Especie map(EspecieModel especieModel);
}
