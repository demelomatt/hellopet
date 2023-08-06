package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.ProcedimentoAgendamentoModel;
import br.com.hellopet.repositories.customer.database.relational.mapper.PetRepositoryMapper;
import br.com.hellopet.repositories.customer.database.relational.mapper.TutorRepositoryMapper;
import br.com.hellopet.domain.business.entity.ProcedimentoAgendamento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        ProcedimentoRepositoryMapper.class,
        ProfissionalRepositoryMapper.class,
        PetRepositoryMapper.class,
        TutorRepositoryMapper.class,
})
public interface ProcedimentoAgendamentoRepositoryMapper {
    ProcedimentoAgendamentoRepositoryMapper INSTANCE = Mappers.getMapper(ProcedimentoAgendamentoRepositoryMapper.class);
    ProcedimentoAgendamentoModel map(ProcedimentoAgendamento procedimentoAgendamento);
    ProcedimentoAgendamento map(ProcedimentoAgendamentoModel procedimentoAgendamentoModel);
}
