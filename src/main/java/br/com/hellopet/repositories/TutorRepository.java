package br.com.hellopet.repositories;

import br.com.hellopet.datasources.database.relational.customer.model.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends PetRepository, JpaRepository<PetModel, Long> {
}
