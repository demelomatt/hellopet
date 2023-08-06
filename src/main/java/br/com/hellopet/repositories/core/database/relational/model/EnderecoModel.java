package br.com.hellopet.repositories.core.database.relational.model;

import br.com.hellopet.repositories.core.database.relational.converter.UnidadeFederacaoConverter;
import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Embeddable
public class EnderecoModel {
    @Column(name = "endereco_cep", nullable = false)
    private String cep;

    @Column(name = "endereco_logradouro")
    private String logradouro;

    @Column(name = "endereco_numero")
    private String numero;

    @Column(name = "endereco_bairro")
    private String bairro;

    @Column(name = "endereco_complemento")
    private String complemento;

    @Column(name = "endereco_cidade")
    private String cidade;

    @Column(name = "endereco_uf")
    @Convert(converter = UnidadeFederacaoConverter.class)
    private UnidadeFederacao uf;
}
