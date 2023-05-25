package com.algaworks.algatransito.api.model.input;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProprietarioIdInput {

    @NotNull
    private Long id;

}
