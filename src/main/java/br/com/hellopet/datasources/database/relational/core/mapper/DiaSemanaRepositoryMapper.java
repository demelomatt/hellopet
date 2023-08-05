package br.com.hellopet.datasources.database.relational.core.mapper;

import br.com.hellopet.datasources.database.relational.core.model.DiaSemanaModel;
import br.com.hellopet.entities.core.DiaSemana;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiaSemanaRepositoryMapper {
    DiaSemanaRepositoryMapper INSTANCE = Mappers.getMapper(DiaSemanaRepositoryMapper.class);

    @Mapping(target = "estabelecimentos", ignore = true)
    DiaSemanaModel map(DiaSemana diaSemana);

    @InheritInverseConfiguration
    DiaSemana map(DiaSemanaModel diaSemanaModel);
}
