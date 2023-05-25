package com.algaworks.algatransito.api.assembler;

import com.algaworks.algatransito.api.model.AutuacaoModel;
import com.algaworks.algatransito.api.model.input.AutuacaoInput;
import com.algaworks.algatransito.domain.model.Autuacao;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class AutuacaoAssembler {

    private final ModelMapper modelMapper;

    public Autuacao toEntity(AutuacaoInput autuacaoInput) {
        return modelMapper.map(autuacaoInput, Autuacao.class);
    }

    public AutuacaoModel toModel(Autuacao autuacao) {
        return modelMapper.map(autuacao, AutuacaoModel.class);
    }

    public List<AutuacaoModel> toCollectionModel(List<Autuacao> autuacoes) {
        return autuacoes.stream()
                .map(this::toModel)
                .toList();
    }

}
