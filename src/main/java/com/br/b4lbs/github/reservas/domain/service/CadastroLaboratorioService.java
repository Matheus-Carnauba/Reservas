package com.br.b4lbs.github.reservas.domain.service;

import com.br.b4lbs.github.reservas.api.assembler.LaboratorioAssembler;
import com.br.b4lbs.github.reservas.api.dto.input.LaboratorioInput;
import com.br.b4lbs.github.reservas.api.dto.output.LaboratorioDTO;
import com.br.b4lbs.github.reservas.domain.model.Laboratorio;
import com.br.b4lbs.github.reservas.domain.repository.LaboratorioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class CadastroLaboratorioService {

    private LaboratorioRepository laboratorioRepository;

    private LaboratorioAssembler laboratorioAssembler;

    @Transactional
    public LaboratorioDTO salvar(LaboratorioInput requestLaboratorio) {
        Laboratorio laboratorioEntity = laboratorioAssembler.toEntity(requestLaboratorio);
        laboratorioRepository.save(laboratorioEntity);
        return laboratorioAssembler.toDTO(laboratorioEntity);
    }
}
