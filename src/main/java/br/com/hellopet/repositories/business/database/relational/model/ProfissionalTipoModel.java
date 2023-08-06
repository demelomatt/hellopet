package br.com.hellopet.repositories.business.database.relational.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "profissional_tipo")
public class ProfissionalTipoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;
}
