package br.com.hellopet.datasources.database.relational.customer.mapper;

import br.com.hellopet.datasources.database.relational.business.mapper.ProcedimentoAgendamentoRepositoryMapper;
import br.com.hellopet.datasources.database.relational.customer.model.PetModel;
import br.com.hellopet.entities.customer.Pet;
import org.mapstruct.Mapper;

@Mapper(uses = {EspecieRepositoryMapper.class,TutorRepositoryMapper.class, ProcedimentoAgendamentoRepositoryMapper.class})
public interface PetRepositoryMapper {
    /*
    Pet map(PetModel petModel);
    PetModel map(Pet pet);

     */
}
