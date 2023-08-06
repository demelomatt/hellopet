package br.com.hellopet.repositories.customer.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.mapper.ProcedimentoAgendamentoRepositoryMapper;
import br.com.hellopet.repositories.customer.database.relational.model.PetModel;
import br.com.hellopet.domain.customer.entity.Pet;
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
