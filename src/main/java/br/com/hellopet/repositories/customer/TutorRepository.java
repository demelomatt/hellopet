package br.com.hellopet.repositories.customer;

import br.com.hellopet.datasources.database.relational.customer.model.TutorModel;
import br.com.hellopet.entities.customer.Tutor;

import java.util.List;
import java.util.Optional;

public interface TutorRepository {
    List<Tutor> list();
    Optional<Tutor> get(Long id);
    Tutor create(Tutor tutor);
    Tutor update(Tutor tutor);
    void delete(Long id);
}
