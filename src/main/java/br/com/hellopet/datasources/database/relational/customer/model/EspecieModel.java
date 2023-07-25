package br.com.hellopet.datasources.database.relational.customer.model;

import br.com.hellopet.datasources.database.relational.business.model.ProfissionalModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "ESPECIE")
public class EspecieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "especies")
    private List<ProfissionalModel> profissionais;
}
