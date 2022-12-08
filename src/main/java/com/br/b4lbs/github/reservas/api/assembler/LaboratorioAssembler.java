package com.br.b4lbs.github.reservas.api.assembler;

import com.br.b4lbs.github.reservas.api.dto.input.LaboratorioInput;
import com.br.b4lbs.github.reservas.api.dto.input.ProdutoInput;
import com.br.b4lbs.github.reservas.api.dto.output.LaboratorioDTO;
import com.br.b4lbs.github.reservas.api.dto.output.ProdutoDTO;
import com.br.b4lbs.github.reservas.domain.model.Laboratorio;
import com.br.b4lbs.github.reservas.domain.model.Produto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class LaboratorioAssembler {

    private ModelMapper modelMapper;

    public LaboratorioDTO toDTO(Laboratorio laboratorio) {
        return modelMapper.map(laboratorio, LaboratorioDTO.class);
    }

    public Laboratorio toEntity(LaboratorioInput laboratorioInput) {
        return modelMapper.map(laboratorioInput, Laboratorio.class);
    }
}
