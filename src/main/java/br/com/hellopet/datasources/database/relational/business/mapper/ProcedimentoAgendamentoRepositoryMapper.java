package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoAgendamentoModel;
import br.com.hellopet.datasources.database.relational.customer.mapper.PetRepositoryMapper;
import br.com.hellopet.datasources.database.relational.customer.mapper.TutorRepositoryMapper;
import br.com.hellopet.entities.business.ProcedimentoAgendamento;
import org.mapstruct.Mapper;

@Mapper(uses = {
        ProcedimentoRepositoryMapper.class,
        ProfissionalRepositoryMapper.class,
        PetRepositoryMapper.class,
        TutorRepositoryMapper.class,

})
public interface ProcedimentoAgendamentoRepositoryMapper {
    ProcedimentoAgendamentoModel map(ProcedimentoAgendamento procedimentoAgendamento);
    ProcedimentoAgendamento map(ProcedimentoAgendamentoModel procedimentoAgendamentoModel);
}
