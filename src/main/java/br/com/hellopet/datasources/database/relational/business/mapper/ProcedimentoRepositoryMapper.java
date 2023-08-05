package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProcedimentoModel;
import br.com.hellopet.entities.business.Procedimento;
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
