package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.ProfissionalModel;
import br.com.hellopet.repositories.core.database.relational.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.repositories.customer.database.relational.mapper.EspecieRepositoryMapper;
import br.com.hellopet.domain.business.entity.Profissional;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        EnderecoRepositoryMapper.class,
        EstabelecimentoRepositoryMapper.class,
        EspecieRepositoryMapper.class,
        ProfissionalAusenciaRepositoryMapper.class,
        ProcedimentoAgendamentoRepositoryMapper.class,
        ProcedimentoGrupoRepositoryMapper.class
})
public interface ProfissionalRepositoryMapper {
    ProfissionalRepositoryMapper INSTANCE = Mappers.getMapper(ProfissionalRepositoryMapper.class);

    ProfissionalModel map(Profissional profissional);

    Profissional map(ProfissionalModel profissionalModel);
}
