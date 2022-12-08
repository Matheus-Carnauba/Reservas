package com.br.b4lbs.github.reservas.api.controller;


import com.br.b4lbs.github.reservas.api.dto.input.LaboratorioInput;
import com.br.b4lbs.github.reservas.api.dto.output.LaboratorioDTO;
import com.br.b4lbs.github.reservas.domain.model.Laboratorio;
import com.br.b4lbs.github.reservas.domain.model.Produto;
import com.br.b4lbs.github.reservas.domain.repository.LaboratorioRepository;
import com.br.b4lbs.github.reservas.domain.service.CadastroLaboratorioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/produtos")
public class LaboratorioController {

    private LaboratorioRepository laboratorioRepository;

    private CadastroLaboratorioService cadastroLaboratorioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LaboratorioDTO cadastrar(@Valid @RequestBody LaboratorioInput laboratorio) {
        return cadastroLaboratorioService.salvar(laboratorio);
    }

    @GetMapping
    public List<Laboratorio> listar() {
        return laboratorioRepository.findAll();
    }
}
