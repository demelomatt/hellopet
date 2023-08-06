package br.com.hellopet.repositories.customer.database.relational.repository;

import br.com.hellopet.repositories.common.database.relational.exception.EntityNotFoundException;
import br.com.hellopet.repositories.common.database.relational.exception.InvalidDataException;
import br.com.hellopet.repositories.customer.database.relational.mapper.TutorRepositoryMapper;
import br.com.hellopet.repositories.customer.database.relational.model.TutorModel;
import br.com.hellopet.domain.customer.entity.Tutor;
import br.com.hellopet.repositories.customer.TutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

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
        try {
            return repositoryMapper.map(jpaRepository.save(tutorModel));
        } catch (DataIntegrityViolationException e) {
            throw new InvalidDataException("Dados informados inválidos. Verifique os atributos.");
        }
    }

    @Transactional
    @Override
    public Tutor update(Tutor tutor) {
        var tutorOptional = jpaRepository.findById(tutor.getId());
        if(tutorOptional.isPresent()) {
            repositoryMapper.update(tutor, tutorOptional.get());
            try{
                var tutorModel = jpaRepository.save(tutorOptional.get());
                return repositoryMapper.map(tutorModel);
            } catch (DataIntegrityViolationException e) {
                throw new InvalidDataException("Dados informados inválidos. Verifique se os atributos não estão duplicados.");
            }
        }
        return null;
    }

    @Transactional
    @Override
    public void delete(Long id) {
        var tutorModel = jpaRepository.findById(id);
        tutorModel.orElseThrow(EntityNotFoundException::new);
        if (tutorModel.get().getAtivo()) {
            tutorModel.get().setAtivo(false);
        } else {
            throw new EntityNotFoundException("Esse tutor já se encontra desativado.");
        }
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
