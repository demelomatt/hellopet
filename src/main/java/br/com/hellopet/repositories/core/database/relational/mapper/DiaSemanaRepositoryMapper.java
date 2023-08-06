package br.com.hellopet.repositories.core.database.relational.mapper;

import br.com.hellopet.repositories.core.database.relational.model.DiaSemanaModel;
import br.com.hellopet.domain.core.entity.DiaSemana;
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
