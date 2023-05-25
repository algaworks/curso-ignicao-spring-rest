package com.algaworks.algatransito.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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

    @Valid
    @NotNull
    @ManyToOne
    private Proprietario proprietario;

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    @NotBlank
    @Pattern(regexp = "[A-Z]{3}[0-9][0-9A-Z][0-9]{2}")
    private String placa;

    @JsonProperty(access = Access.READ_ONLY)
    @Enumerated(EnumType.STRING)
    private StatusVeiculo status;

    @JsonProperty(access = Access.READ_ONLY)
    private LocalDateTime dataCadastro;

    @JsonProperty(access = Access.READ_ONLY)
    private LocalDateTime dataApreensao;

}
