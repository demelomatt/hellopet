package br.com.hellopet.datasources.database.relational.business.mapper;

import br.com.hellopet.datasources.database.relational.business.model.ProfissionalModel;
import br.com.hellopet.datasources.database.relational.core.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.datasources.database.relational.customer.mapper.EspecieRepositoryMapper;
import br.com.hellopet.entities.business.Profissional;
import org.mapstruct.Mapper;

@Mapper(uses = {
        EnderecoRepositoryMapper.class,
        EstabelecimentoRepositoryMapper.class,
        EspecieRepositoryMapper.class,
        ProfissionalAusenciaRepositoryMapper.class,
        ProcedimentoAgendamentoRepositoryMapper.class,
        ProcedimentoGrupoRepositoryMapper.class
})
public interface ProfissionalRepositoryMapper {
    ProfissionalModel map(Profissional profissional);
    Profissional map(ProfissionalModel profissionalModel);
}
