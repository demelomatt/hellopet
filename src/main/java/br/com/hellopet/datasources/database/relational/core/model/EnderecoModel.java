package br.com.hellopet.datasources.database.relational.core.model;

import br.com.hellopet.datasources.database.relational.core.converter.UnidadeFederacaoConverter;
import br.com.hellopet.entities.core.enums.UnidadeFederacao;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Embeddable
public class EnderecoModel {
    @Column(name = "endereco_cep", nullable = false)
    private String cep;

    @Column(name = "endereco_nome")
    private String endereco;

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
