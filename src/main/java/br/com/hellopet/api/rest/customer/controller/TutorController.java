package br.com.hellopet.api.rest.customer.controller;

import br.com.hellopet.api.rest.customer.mapper.TutorApiMapper;
import br.com.hellopet.api.rest.customer.model.TutorRequest;
import br.com.hellopet.api.rest.customer.model.TutorResponse;
import br.com.hellopet.usecases.customer.TutorUseCase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("customer/tutores")
public class TutorController {
    private final TutorApiMapper tutorMapper = TutorApiMapper.INSTANCE;
    private final TutorUseCase tutorUseCase;

    public TutorController(TutorUseCase tutorUseCase) {
        this.tutorUseCase = tutorUseCase;
    }

    @PostMapping
    public ResponseEntity<TutorResponse> create(
            @RequestBody TutorRequest tutorRequest,
            UriComponentsBuilder uriBuilder
    ) {
        var tutor = tutorUseCase.create(tutorMapper.map(tutorRequest));

        var uri = uriBuilder.path("/customer/tutores/{id}").buildAndExpand(tutor.getId()).toUri();
        return ResponseEntity.created(uri).body(tutorMapper.map(tutor));
    }

    @PutMapping
    public ResponseEntity<TutorResponse> update(@RequestBody TutorRequest tutorRequest) {
        var tutor = tutorUseCase.update(tutorMapper.map(tutorRequest));
        return ResponseEntity.ok(tutorMapper.map(tutor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tutorUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutorResponse> get(@PathVariable Long id) {
        var tutor = tutorUseCase.get(id);
        return ResponseEntity.ok(tutorMapper.map(tutor));
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
                .map(tutorMapper::map)
                .toList();
        return ResponseEntity.ok(new PageImpl<>(tutores));
    }
}
