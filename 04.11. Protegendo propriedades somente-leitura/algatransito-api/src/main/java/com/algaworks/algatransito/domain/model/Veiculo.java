package com.algaworks.algatransito.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    private Proprietario proprietario;

    private String marca;
    private String modelo;
    private String placa;

    @JsonProperty(access = Access.READ_ONLY)
    @Enumerated(EnumType.STRING)
    private StatusVeiculo status;

    @JsonProperty(access = Access.READ_ONLY)
    private LocalDateTime dataCadastro;

    @JsonProperty(access = Access.READ_ONLY)
    private LocalDateTime dataApreensao;

}
