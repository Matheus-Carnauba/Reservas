package com.br.b4lbs.github.reservas.api.controller;


import com.br.b4lbs.github.reservas.api.dto.input.ProdutoInput;
import com.br.b4lbs.github.reservas.api.dto.output.ProdutoDTO;
import com.br.b4lbs.github.reservas.domain.model.Produto;
import com.br.b4lbs.github.reservas.domain.repository.ProdutoRepository;
import com.br.b4lbs.github.reservas.domain.service.CadastroProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    private CadastroProdutoService cadastroProdutoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoDTO cadastrar(@Valid @RequestBody ProdutoInput produto) {
        return cadastroProdutoService.salvar(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }
}
