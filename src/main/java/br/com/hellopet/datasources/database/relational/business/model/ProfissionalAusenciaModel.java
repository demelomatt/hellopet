package br.com.hellopet.datasources.database.relational.business.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "profissional_ausencia")
public class ProfissionalAusenciaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "profissional_id", referencedColumnName = "id", nullable = false)
    private ProfissionalModel profissional;

    @Column(name = "inicio", nullable = false)
    private LocalDateTime inicio;

    @Column(name = "fim", nullable = false)
    private LocalDateTime fim;

}
