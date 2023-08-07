package br.com.hellopet.domain.customer.usecase;

import br.com.hellopet.domain.common.exception.InvalidParameterException;
import br.com.hellopet.domain.common.exception.NotFoundException;
import br.com.hellopet.domain.customer.entity.Tutor;
import br.com.hellopet.repositories.customer.TutorRepository;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Service
@Validated
public class TutorUseCase {
    private final TutorRepository tutorRepository;

    public TutorUseCase(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public Tutor create(@Valid Tutor tutor) {
        if (tutor.getAtivo() == null) {
            tutor.setAtivo(true);
        }

        if (tutor.getDataCadastro() == null) {
            tutor.setDataCadastro(LocalDate.now());
        }
        
        return tutorRepository.create(tutor);
    }

    public Tutor update(@Valid Tutor tutor) {
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
            try {
                Class.forName("br.com.hellopet.domain.customer.entity.Tutor").getDeclaredField(sortField);

                Sort sort = Sort.by(Sort.Direction.fromString(sortOrder), sortField);
                var pageable = PageRequest.of(pageNumber, pageSize, sort);
                return tutorRepository.list(pageable);

            } catch (NoSuchFieldException | ClassNotFoundException e) {
                throw new InvalidParameterException("Campo informado não existe: " + e.getMessage());
            }
        }

        var pageable = PageRequest.of(pageNumber, pageSize);
        return tutorRepository.list(pageable);
    }
}
