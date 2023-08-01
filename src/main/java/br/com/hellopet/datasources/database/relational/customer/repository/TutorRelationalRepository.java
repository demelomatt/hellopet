package br.com.hellopet.datasources.database.relational.customer.repository;

import br.com.hellopet.entities.customer.Tutor;
import br.com.hellopet.repositories.customer.TutorRepository;

import java.util.List;
import java.util.Optional;

public class TutorRelationalRepository implements TutorRepository {

    private final TutorJpaRepository jpaRepository;
    //private final TutorRepositoryMapper repositoryMapper = TutorRepositoryMapper.INSTANCE;

    public TutorRelationalRepository(TutorJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<Tutor> list() {
        /*
        return jpaRepository.findAll()
                .stream()
                .map(repositoryMapper::map)
                .toList();

         */
        return List.of(new Tutor());
    }

    @Override
    public Optional<Tutor> get(Long id) {
        /*
        return jpaRepository.findById(id)
                .stream()
                .map(repositoryMapper::map)
                .findFirst();

         */
        return Optional.of(new Tutor());
    }

    @Override
    public Tutor create(Tutor tutor) {
        /*
        TutorModel tutorModel = repositoryMapper.map(tutor);
        return repositoryMapper.map(jpaRepository.save(tutorModel));

         */
        return new Tutor();
    }

    @Override
    public Tutor update(Tutor tutor) {
        /*
        TutorModel tutorModel = repositoryMapper.map(tutor);
        return repositoryMapper.map(tutorModel);

         */
        return new Tutor();
    }

    @Override
    public void delete(Long id) {
        /*
        jpaRepository.deleteById(id);

         */
    }
}
