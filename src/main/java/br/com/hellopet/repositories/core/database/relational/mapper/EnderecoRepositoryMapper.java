package br.com.hellopet.repositories.core.database.relational.mapper;

import br.com.hellopet.repositories.core.database.relational.model.EnderecoModel;
import br.com.hellopet.domain.core.entity.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnderecoRepositoryMapper {
    EnderecoRepositoryMapper INSTANCE = Mappers.getMapper(EnderecoRepositoryMapper.class);

    Endereco map(EnderecoModel enderecoModel);

    EnderecoModel map(Endereco endereco);
}
