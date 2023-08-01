package br.com.hellopet.controllers.rest.core;

import br.com.hellopet.controllers.rest.core.mapper.MunicipioApiMapper;
import br.com.hellopet.controllers.rest.core.model.MunicipioResponse;
import br.com.hellopet.usecases.core.MunicipioUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin/endereco/cidades")
public class MunicipioControllerImpl {
    private final MunicipioUseCase municipioUseCase;
    private final MunicipioApiMapper mapper = MunicipioApiMapper.INSTANCE;

    public MunicipioControllerImpl(MunicipioUseCase municipioUseCase) {
        this.municipioUseCase = municipioUseCase;
    }

    @GetMapping
    public ResponseEntity<List<MunicipioResponse>> list(@RequestParam(required = false) Optional<String> uf,
                                                        @RequestParam(required = false) Optional<String> municipio) {
        var municipios = municipioUseCase.list(uf, municipio)
                .stream().map(mapper::map).toList();
        return ResponseEntity.ok(municipios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MunicipioResponse> get(@PathVariable Long id) {
        var municipio = municipioUseCase.get(id);
        return ResponseEntity.ok(mapper.map(municipio));
    }
}
