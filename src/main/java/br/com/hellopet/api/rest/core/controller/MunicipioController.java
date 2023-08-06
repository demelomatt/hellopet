package br.com.hellopet.api.rest.core.controller;

import br.com.hellopet.api.rest.core.mapper.MunicipioApiMapper;
import br.com.hellopet.api.rest.core.model.MunicipioResponse;
import br.com.hellopet.domain.core.usecase.MunicipioUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public class MunicipioController {
    private static final MunicipioApiMapper MAPPER = MunicipioApiMapper.INSTANCE;
    private final MunicipioUseCase municipioUseCase;

    public MunicipioController(MunicipioUseCase municipioUseCase) {
        this.municipioUseCase = municipioUseCase;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MunicipioResponse> get(Long id) {
        var municipio = municipioUseCase.get(id);
        return ResponseEntity.ok(MAPPER.map(municipio));
    }

    @GetMapping
    public ResponseEntity<List<MunicipioResponse>> list(
            @RequestParam(required = false) Optional<String> uf,
            @RequestParam(required = false) Optional<String> municipio
    ) {
        var municipios = municipioUseCase.list(uf, municipio)
                .stream().map(MAPPER::map).toList();
        return ResponseEntity.ok(municipios);
    }

}
