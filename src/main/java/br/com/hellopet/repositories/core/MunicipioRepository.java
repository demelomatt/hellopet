package br.com.hellopet.repositories.core;

import br.com.hellopet.entities.core.Municipio;
import br.com.hellopet.entities.core.enums.UnidadeFederacao;

import java.util.List;
import java.util.Optional;

public interface MunicipioRepository {

    List<Municipio> list();
    List<Municipio> list(UnidadeFederacao uf);
    List<Municipio> list(String municipio);
    List<Municipio> list(UnidadeFederacao uf, String municipio);
    Optional<Municipio> get(Long id);
}
