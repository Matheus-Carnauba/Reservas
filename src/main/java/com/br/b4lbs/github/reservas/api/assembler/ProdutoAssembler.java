package com.br.b4lbs.github.reservas.api.assembler;

import com.br.b4lbs.github.reservas.api.dto.input.ProdutoInput;
import com.br.b4lbs.github.reservas.api.dto.output.ProdutoDTO;
import com.br.b4lbs.github.reservas.domain.model.Produto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ProdutoAssembler {

    private ModelMapper modelMapper;

    public ProdutoDTO toDTO(Produto produto) {
        return modelMapper.map(produto, ProdutoDTO.class);
    }

    public Produto toEntity(ProdutoInput produtoInput) {
        return modelMapper.map(produtoInput, Produto.class);
    }
}
