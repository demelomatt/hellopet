package br.com.hellopet.api.rest.core.mapper;

import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import org.mapstruct.Mapper;

@Mapper
public interface UfApiMapper {
    default UnidadeFederacao map(String uf) {
        return UnidadeFederacao.valueOf(uf);
    }

    default String map(UnidadeFederacao uf) {
        return uf.getNome();
    }
}
