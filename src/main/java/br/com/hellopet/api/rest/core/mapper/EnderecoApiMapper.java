package br.com.hellopet.api.rest.core.mapper;

import br.com.hellopet.api.rest.core.model.EnderecoRequest;
import br.com.hellopet.api.rest.core.model.EnderecoResponse;
import br.com.hellopet.domain.core.entity.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        UfApiMapper.class
})
public interface EnderecoApiMapper {
    EnderecoApiMapper INSTANCE = Mappers.getMapper(EnderecoApiMapper.class);

    Endereco map(EnderecoRequest enderecoRequest);

    EnderecoResponse map(Endereco endereco);
}
