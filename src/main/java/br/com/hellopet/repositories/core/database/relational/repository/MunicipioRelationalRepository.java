package br.com.hellopet.repositories.core.database.relational.repository;

import br.com.hellopet.repositories.core.database.relational.mapper.MunicipioRepositoryMapper;
import br.com.hellopet.domain.core.entity.Municipio;
import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import br.com.hellopet.repositories.core.MunicipioRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MunicipioRelationalRepository implements MunicipioRepository  {

    private final MunicipioJpaRepository jpaRepository;
    private final MunicipioRepositoryMapper repositoryMapper = MunicipioRepositoryMapper.INSTANCE;

    public MunicipioRelationalRepository(MunicipioJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<Municipio> list() {
        return jpaRepository.findAll()
                .stream()
                .map(repositoryMapper::map)
                .toList();
    }

    @Override
    public List<Municipio> list(UnidadeFederacao uf) {
        return jpaRepository.findAllByUf(uf)
                .stream()
                .map(repositoryMapper::map)
                .toList();
    }

    @Override
    public List<Municipio> list(String municipio) {
        return jpaRepository.findByNomeContainingIgnoreCase(municipio)
                .stream()
                .map(repositoryMapper::map)
                .toList();
    }

    @Override
    public List<Municipio> list(UnidadeFederacao uf, String municipio) {
        return jpaRepository.findByUfAndNomeContainingIgnoreCase(uf, municipio)
                .stream()
                .map(repositoryMapper::map)
                .toList();
    }

    @Override
    public Optional<Municipio> get(Long id) {
        return jpaRepository.findById(id)
                .stream()
                .map(repositoryMapper::map)
                .findFirst();
    }
}
