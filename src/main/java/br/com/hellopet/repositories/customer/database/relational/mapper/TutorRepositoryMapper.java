package br.com.hellopet.repositories.customer.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.mapper.EstabelecimentoRepositoryMapper;
import br.com.hellopet.repositories.business.database.relational.mapper.ProcedimentoAgendamentoRepositoryMapper;
import br.com.hellopet.repositories.core.database.relational.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.repositories.customer.database.relational.model.TutorModel;
import br.com.hellopet.domain.customer.entity.Tutor;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        EnderecoRepositoryMapper.class,
        PetRepositoryMapper.class,
        EstabelecimentoRepositoryMapper.class,
        ProcedimentoAgendamentoRepositoryMapper.class
})
public interface TutorRepositoryMapper {
    TutorRepositoryMapper INSTANCE = Mappers.getMapper(TutorRepositoryMapper.class);

    @Mapping(target = "estabelecimentos", ignore = true)
    TutorModel map(Tutor tutor);

    @InheritInverseConfiguration(name = "map")
    Tutor map(TutorModel tutorModel);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void update(Tutor tutor, @MappingTarget TutorModel tutorModel);
}