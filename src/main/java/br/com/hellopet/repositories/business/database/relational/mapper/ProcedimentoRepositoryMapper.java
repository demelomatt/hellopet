package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.ProcedimentoModel;
import br.com.hellopet.domain.business.entity.Procedimento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        ProcedimentoTipoRepositoryMapper.class,
        EstabelecimentoRepositoryMapper.class,
        ProcedimentoAgendamentoRepositoryMapper.class
})
public interface ProcedimentoRepositoryMapper {
    ProcedimentoRepositoryMapper INSTANCE = Mappers.getMapper(ProcedimentoRepositoryMapper.class);

    ProcedimentoModel map(Procedimento procedimento);

    Procedimento map(ProcedimentoModel procedimentoModel);
}
