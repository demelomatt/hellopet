package br.com.hellopet.datasources.database.relational.core.model;

import br.com.hellopet.datasources.database.relational.core.mapper.UnidadeFederacaoConverter;
import br.com.hellopet.entities.core.enums.UnidadeFederacao;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="municipio")
public class MunicipioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "uf_id", nullable = false)
    @Convert(converter = UnidadeFederacaoConverter.class)
    private UnidadeFederacao uf;

    @Column(name = "ibge", nullable = false, length = 7, unique = true)
    private Integer ibge;
}
