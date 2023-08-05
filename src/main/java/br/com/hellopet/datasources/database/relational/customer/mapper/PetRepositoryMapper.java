package br.com.hellopet.datasources.database.relational.customer.mapper;

import br.com.hellopet.datasources.database.relational.business.mapper.ProcedimentoAgendamentoRepositoryMapper;
import br.com.hellopet.datasources.database.relational.customer.model.PetModel;
import br.com.hellopet.entities.customer.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        EspecieRepositoryMapper.class,
        TutorRepositoryMapper.class,
        ProcedimentoAgendamentoRepositoryMapper.class
})
public interface PetRepositoryMapper {
    PetRepositoryMapper INSTANCE = Mappers.getMapper(PetRepositoryMapper.class);

    Pet map(PetModel petModel);

    PetModel map(Pet pet);
}
