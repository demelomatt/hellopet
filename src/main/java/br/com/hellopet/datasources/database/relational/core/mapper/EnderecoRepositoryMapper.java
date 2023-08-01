package br.com.hellopet.datasources.database.relational.core.mapper;

import br.com.hellopet.datasources.database.relational.core.model.EnderecoModel;
import br.com.hellopet.entities.core.Endereco;
import org.mapstruct.Mapper;

@Mapper
public interface EnderecoRepositoryMapper {
    Endereco map(EnderecoModel enderecoModel);
    EnderecoModel map(Endereco endereco);
}
