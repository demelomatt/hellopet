package br.com.hellopet.api.rest.core.controller;

import br.com.hellopet.api.rest.core.mapper.MunicipioApiMapper;
import br.com.hellopet.api.rest.core.model.MunicipioResponse;
import br.com.hellopet.usecases.core.MunicipioUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public class MunicipioController {
    private final MunicipioApiMapper mapper = MunicipioApiMapper.INSTANCE;
    private final MunicipioUseCase municipioUseCase;

    public MunicipioController(MunicipioUseCase municipioUseCase) {
        this.municipioUseCase = municipioUseCase;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MunicipioResponse> get(Long id) {
        var municipio = municipioUseCase.get(id);
        return ResponseEntity.ok(mapper.map(municipio));
    }

    @GetMapping
    public ResponseEntity<List<MunicipioResponse>> list(
            @RequestParam(required = false) Optional<String> uf,
            @RequestParam(required = false) Optional<String> municipio
    ) {
        var municipios = municipioUseCase.list(uf, municipio)
                .stream().map(mapper::map).toList();
        return ResponseEntity.ok(municipios);
    }

}
