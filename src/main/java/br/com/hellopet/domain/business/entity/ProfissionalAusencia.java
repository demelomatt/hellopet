package br.com.hellopet.domain.business.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProfissionalAusencia {
    private Long id;
    private Profissional profissional;
    private LocalDateTime inicio;
    private LocalDateTime fim;
}
