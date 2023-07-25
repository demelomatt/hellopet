package br.com.hellopet.datasources.database.relational.business.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ESTABELECIMENTO_TIPO")
public class EstabelecimentoTipoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;
}
