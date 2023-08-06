package br.com.hellopet.repositories.customer.database.relational.repository;

import br.com.hellopet.repositories.customer.database.relational.model.TutorModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorJpaRepository extends JpaRepository<TutorModel, Long> {
    Page<TutorModel> findAllByAtivoTrue(Pageable pageable);
}
