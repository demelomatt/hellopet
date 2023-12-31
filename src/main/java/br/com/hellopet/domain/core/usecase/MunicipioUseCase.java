package br.com.hellopet.domain.core.usecase;

import br.com.hellopet.domain.common.exception.NotFoundException;
import br.com.hellopet.domain.core.entity.Municipio;
import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import br.com.hellopet.repositories.core.MunicipioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MunicipioUseCase {
    private final MunicipioRepository municipioRepository;

    public MunicipioUseCase(MunicipioRepository municipioRepository) {
        this.municipioRepository = municipioRepository;
    }

    public List<Municipio> list(Optional<String> uf, Optional<String> municipio) {

        if (uf.isPresent() && municipio.isPresent()) {
            return municipioRepository.list(getUf(uf.get()), municipio.get());
        }

        if (uf.isPresent()) {
            return municipioRepository.list(getUf(uf.get()));
        }

        if (municipio.isPresent()) {
            return municipioRepository.list(municipio.get());
        }

        return municipioRepository.list();
    }

    public Municipio get(Long id) {
        return municipioRepository.get(id).orElseThrow(NotFoundException::new);
    }

    private UnidadeFederacao getUf(String uf) {
        try {
            return UnidadeFederacao.valueOf(uf.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new NotFoundException();
        }
    }
}
