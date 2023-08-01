package br.com.hellopet.datasources.database.relational.core.repository;

import br.com.hellopet.datasources.database.relational.core.model.MunicipioModel;
import br.com.hellopet.entities.core.Municipio;
import br.com.hellopet.entities.core.enums.UnidadeFederacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MunicipioJpaRepository extends JpaRepository<MunicipioModel, Long> {
    List<MunicipioModel> findAllByUf(UnidadeFederacao uf);
    List<MunicipioModel> findByNomeContainingIgnoreCase(String municipio);
    List<MunicipioModel> findByUfAndNomeContainingIgnoreCase(UnidadeFederacao uf, String municipio);
}
