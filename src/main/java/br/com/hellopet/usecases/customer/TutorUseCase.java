package br.com.hellopet.usecases.customer;

import br.com.hellopet.usecases.common.exception.NotFoundException;
import br.com.hellopet.entities.customer.Tutor;
import br.com.hellopet.repositories.customer.TutorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TutorUseCase {
    private final TutorRepository tutorRepository;

    public TutorUseCase(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public Tutor create(Tutor tutor) {
        if (tutor.getAtivo() == null) {
            tutor.setAtivo(true);
        }
        return tutorRepository.create(tutor);
    }

    public Tutor update(Tutor tutor) {
        if (tutor.getId() == null) {
            throw new NotFoundException("Nenhum id informado.");
        }

        var tutorEntity = tutorRepository.update(tutor);
        if(tutorEntity == null) {
            throw new NotFoundException("Tutor com id informado não existe.");
        }

        return tutorEntity;
    }

    public void delete(Long id) {
        tutorRepository.delete(id);
    }

    public Tutor get(Long id) {
        return tutorRepository.get(id).orElseThrow(NotFoundException::new);
    }

    public Page<Tutor> list(Integer pageNumber, Integer pageSize, String sortOrder, String sortField) {

        if (sortField != null) {
            Sort sort = Sort.by(Sort.Direction.fromString(sortOrder), sortField);
            var pageable = PageRequest.of(pageNumber, pageSize, sort);
            return tutorRepository.list(pageable);
        }

        var pageable = PageRequest.of(pageNumber, pageSize);
        return tutorRepository.list(pageable);
    }
}
