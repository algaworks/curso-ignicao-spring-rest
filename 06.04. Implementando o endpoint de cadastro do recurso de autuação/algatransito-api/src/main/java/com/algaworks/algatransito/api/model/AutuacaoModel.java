package com.algaworks.algatransito.api.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class AutuacaoModel {

    private Long id;
    private String descricao;
    private BigDecimal valorMulta;
    private OffsetDateTime dataOcorrencia;

}
