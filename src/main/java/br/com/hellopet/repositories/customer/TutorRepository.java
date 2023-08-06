package br.com.hellopet.repositories.customer;

import br.com.hellopet.entities.customer.Tutor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TutorRepository {
    Tutor create(Tutor tutor);
    Tutor update(Tutor tutor);
    void delete(Long id);
    Optional<Tutor> get(Long id);
    Page<Tutor> list(Pageable pageable);
}
