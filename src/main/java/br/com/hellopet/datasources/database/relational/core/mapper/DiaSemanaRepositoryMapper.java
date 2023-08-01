package br.com.hellopet.datasources.database.relational.core.mapper;

import br.com.hellopet.datasources.database.relational.core.model.DiaSemanaModel;
import br.com.hellopet.entities.core.enums.DiaSemana;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DiaSemanaRepositoryMapper {

    @Mapping(target = "estabelecimentos", ignore = true)
    default DiaSemanaModel map(DiaSemana diaSemana) {
        var diaSemanaModel = new DiaSemanaModel();
        diaSemanaModel.setId((long) diaSemana.getId());
        diaSemanaModel.setDia(diaSemana.name());
        return diaSemanaModel;
    }

    @InheritInverseConfiguration
    default DiaSemana map(DiaSemanaModel diaSemanaModel) {
        return DiaSemana.valueOf(diaSemanaModel.getDia());
    }
}
