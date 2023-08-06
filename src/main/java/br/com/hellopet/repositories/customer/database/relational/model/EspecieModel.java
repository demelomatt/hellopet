package br.com.hellopet.repositories.customer.database.relational.model;

import br.com.hellopet.repositories.business.database.relational.model.ProfissionalModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "especie")
public class EspecieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "especies")
    private List<ProfissionalModel> profissionais;
}
