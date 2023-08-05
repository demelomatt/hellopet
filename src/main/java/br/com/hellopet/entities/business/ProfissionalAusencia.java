package br.com.hellopet.entities.business;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProfissionalAusencia {
    private Long id;
    private Profissional profissional;
    private LocalDateTime inicio;
    private LocalDateTime fim;
}
