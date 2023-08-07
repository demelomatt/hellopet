package br.com.hellopet.api.rest.customer.controller;

import br.com.hellopet.api.rest.customer.mapper.TutorApiMapper;
import br.com.hellopet.api.rest.customer.model.TutorCreateRequest;
import br.com.hellopet.api.rest.customer.model.TutorResponse;
import br.com.hellopet.api.rest.customer.model.TutorUpdateRequest;
import br.com.hellopet.domain.customer.usecase.TutorUseCase;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("customer/tutores")
public class TutorController {
    private static final TutorApiMapper MAPPER = TutorApiMapper.INSTANCE;
    private final TutorUseCase tutorUseCase;

    public TutorController(TutorUseCase tutorUseCase) {
        this.tutorUseCase = tutorUseCase;
    }

    @PostMapping
    public ResponseEntity<TutorResponse> create(
            @Valid @RequestBody TutorCreateRequest tutorRequest,
            UriComponentsBuilder uriBuilder
    ) {
        var tutor = tutorUseCase.create(MAPPER.map(tutorRequest));

        var uri = uriBuilder.path("/customer/tutores/{id}").buildAndExpand(tutor.getId()).toUri();
        return ResponseEntity.created(uri).body(MAPPER.map(tutor));
    }

    @PutMapping
    public ResponseEntity<TutorResponse> update(@Valid @RequestBody TutorUpdateRequest tutorRequest) {
        var tutor = tutorUseCase.update(MAPPER.map(tutorRequest));
        return ResponseEntity.ok(MAPPER.map(tutor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tutorUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutorResponse> get(@PathVariable Long id) {
        var tutor = tutorUseCase.get(id);
        return ResponseEntity.ok(MAPPER.map(tutor));
    }

    @GetMapping
    public ResponseEntity<Page<TutorResponse>> list(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "25") int pageSize,
            @RequestParam(defaultValue = "asc") String sortOrder,
            @RequestParam(required = false) String sortField
    ) {
        var tutores = tutorUseCase.list(pageNumber, pageSize, sortOrder, sortField)
                .stream()
                .map(MAPPER::map)
                .toList();
        return ResponseEntity.ok(new PageImpl<>(tutores));
    }
}
