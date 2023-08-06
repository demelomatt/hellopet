package br.com.hellopet.datasources.database.relational.customer.repository;

import br.com.hellopet.datasources.database.relational.customer.model.TutorModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface TutorJpaRepository extends JpaRepository<TutorModel, Long> {
    Page<TutorModel> findAllByAtivoTrue(Pageable pageable);
}
