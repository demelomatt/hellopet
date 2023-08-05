package br.com.hellopet.datasources.database.relational.customer.mapper;

import br.com.hellopet.datasources.database.relational.business.mapper.EstabelecimentoRepositoryMapper;
import br.com.hellopet.datasources.database.relational.business.mapper.ProcedimentoAgendamentoRepositoryMapper;
import br.com.hellopet.datasources.database.relational.core.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.datasources.database.relational.customer.model.TutorModel;
import br.com.hellopet.entities.customer.Tutor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {EnderecoRepositoryMapper.class, PetRepositoryMapper.class, EstabelecimentoRepositoryMapper.class, ProcedimentoAgendamentoRepositoryMapper.class})
public interface TutorRepositoryMapper {

    TutorRepositoryMapper INSTANCE = Mappers.getMapper(TutorRepositoryMapper.class);
    @Mapping(target = "estabelecimentos", ignore = true)
    TutorModel map(Tutor tutor);

    @InheritInverseConfiguration
    Tutor map(TutorModel tutorModel);

}