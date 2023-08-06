package br.com.hellopet.repositories.customer;

import br.com.hellopet.domain.customer.entity.Tutor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TutorRepository {
    Tutor create(Tutor tutor);
    Tutor update(Tutor tutor);
    void delete(Long id);
    Optional<Tutor> get(Long id);
    Page<Tutor> list(Pageable pageable);
}
