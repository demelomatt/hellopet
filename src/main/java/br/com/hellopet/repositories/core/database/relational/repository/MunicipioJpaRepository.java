package br.com.hellopet.repositories.core.database.relational.repository;

import br.com.hellopet.repositories.core.database.relational.model.MunicipioModel;
import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MunicipioJpaRepository extends JpaRepository<MunicipioModel, Long> {
    List<MunicipioModel> findAllByUf(UnidadeFederacao uf);
    List<MunicipioModel> findByNomeContainingIgnoreCase(String municipio);
    List<MunicipioModel> findByUfAndNomeContainingIgnoreCase(UnidadeFederacao uf, String municipio);
}
