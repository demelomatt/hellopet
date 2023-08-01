package br.com.hellopet.datasources.database.relational.customer.repository;

import br.com.hellopet.datasources.database.relational.customer.model.TutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorJpaRepository extends JpaRepository<TutorModel, Long> {
}
