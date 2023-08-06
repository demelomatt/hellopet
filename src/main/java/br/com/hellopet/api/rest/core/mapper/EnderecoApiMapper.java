package br.com.hellopet.api.rest.core.mapper;

import br.com.hellopet.api.rest.core.model.EnderecoRequest;
import br.com.hellopet.api.rest.core.model.EnderecoResponse;
import br.com.hellopet.entities.core.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        UfApiMapper.class
})
public interface EnderecoApiMapper {
    EnderecoApiMapper INSTANCE = Mappers.getMapper(EnderecoApiMapper.class);

    Endereco map(EnderecoRequest enderecoRequest);

    EnderecoResponse map(Endereco tutor);
}
