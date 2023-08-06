package br.com.hellopet.datasources.database.relational.customer.repository;

import br.com.hellopet.common.exception.NotFoundException;
import br.com.hellopet.datasources.database.relational.customer.mapper.TutorRepositoryMapper;
import br.com.hellopet.datasources.database.relational.customer.model.TutorModel;
import br.com.hellopet.entities.customer.Tutor;
import br.com.hellopet.repositories.customer.TutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TutorRelationalRepository implements TutorRepository {

    private final TutorRepositoryMapper repositoryMapper = TutorRepositoryMapper.INSTANCE;
    private final TutorJpaRepository jpaRepository;

    public TutorRelationalRepository(TutorJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Transactional
    @Override
    public Tutor create(Tutor tutor) {
        TutorModel tutorModel = repositoryMapper.map(tutor);
        return repositoryMapper.map(jpaRepository.save(tutorModel));
    }

    @Transactional
    @Override
    public Tutor update(Tutor tutor) {
        var tutorOptional = jpaRepository.findById(tutor.getId());
        if(tutorOptional.isPresent()) {
            repositoryMapper.update(tutor, tutorOptional.get());
            var tutorModel = jpaRepository.save(tutorOptional.get());
            return repositoryMapper.map(tutorModel);
        }
        return null;
    }

    @Transactional
    @Override
    public void delete(Long id) {
        var tutorModel = jpaRepository.findById(id);
        tutorModel.orElseThrow(NotFoundException::new);
        tutorModel.get().setAtivo(false);
    }

    @Override
    public Optional<Tutor> get(Long id) {
        return jpaRepository.findById(id)
                .stream()
                .map(repositoryMapper::map)
                .findFirst();
    }

    @Override
    public Page<Tutor> list(Pageable pageable) {
        var tutores = jpaRepository.findAllByAtivoTrue(pageable)
                .stream()
                .map(repositoryMapper::map)
                .toList();
        return new PageImpl<>(tutores);
    }
}
