package br.com.hellopet.api.rest.customer.mapper;

import br.com.hellopet.api.rest.core.mapper.EnderecoApiMapper;
import br.com.hellopet.api.rest.customer.model.TutorRequest;
import br.com.hellopet.api.rest.customer.model.TutorResponse;
import br.com.hellopet.domain.customer.entity.Tutor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        EnderecoApiMapper.class
})
public interface TutorApiMapper {
    TutorApiMapper INSTANCE = Mappers.getMapper(TutorApiMapper.class);

    Tutor map(TutorRequest tutorRequest);

    TutorResponse map(Tutor tutor);
}
