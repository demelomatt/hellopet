package br.com.hellopet.datasources.database.relational.core.mapper;

import br.com.hellopet.datasources.database.relational.core.model.EnderecoModel;
import br.com.hellopet.entities.core.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnderecoRepositoryMapper {
    EnderecoRepositoryMapper INSTANCE = Mappers.getMapper(EnderecoRepositoryMapper.class);

    Endereco map(EnderecoModel enderecoModel);

    EnderecoModel map(Endereco endereco);
}
