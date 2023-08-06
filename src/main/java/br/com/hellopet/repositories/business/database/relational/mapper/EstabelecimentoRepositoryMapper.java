package br.com.hellopet.repositories.business.database.relational.mapper;

import br.com.hellopet.repositories.business.database.relational.model.EstabelecimentoModel;
import br.com.hellopet.repositories.core.database.relational.mapper.DiaSemanaRepositoryMapper;
import br.com.hellopet.repositories.core.database.relational.mapper.EnderecoRepositoryMapper;
import br.com.hellopet.domain.business.entity.Estabelecimento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        EstabelecimentoTipoRepositoryMapper.class,
        EnderecoRepositoryMapper.class,
        ProcedimentoRepositoryMapper.class,
        DiaSemanaRepositoryMapper.class,
        ProfissionalRepositoryMapper.class
})
public interface EstabelecimentoRepositoryMapper {
    EstabelecimentoRepositoryMapper INSTANCE = Mappers.getMapper(EstabelecimentoRepositoryMapper.class);

    @Mapping(target = "tutores", ignore = true)
    //@Mapping(target = "diasFuncionamento", ignore = true)
    EstabelecimentoModel map(Estabelecimento estabelecimento);

    @InheritInverseConfiguration
    //@Mapping(target = "diasFuncionamento", source = "diasFuncionamento", ignore = true)
    Estabelecimento map(EstabelecimentoModel estabelecimentoModel);
}
