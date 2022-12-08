package com.br.b4lbs.github.reservas.domain.service;

import com.br.b4lbs.github.reservas.api.assembler.ProdutoAssembler;
import com.br.b4lbs.github.reservas.api.dto.input.ProdutoInput;
import com.br.b4lbs.github.reservas.api.dto.output.ProdutoDTO;
import com.br.b4lbs.github.reservas.domain.enums.SituacaoProduto;
import com.br.b4lbs.github.reservas.domain.model.Produto;
import com.br.b4lbs.github.reservas.domain.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.OffsetDateTime;

import static com.br.b4lbs.github.reservas.domain.enums.SituacaoProduto.EM_ESTOQUE;

@AllArgsConstructor
@Service
public class CadastroProdutoService {

    private ProdutoRepository produtoRepository;

    private ProdutoAssembler produtoAssembler;

    @Transactional
    public ProdutoDTO salvar(ProdutoInput requestProduto) {
        Produto produtoEntity = produtoAssembler.toEntity(requestProduto);
        produtoEntity.setDataEntrada(OffsetDateTime.now());
        produtoEntity.setSituacao(EM_ESTOQUE);
        produtoRepository.save(produtoEntity);
        return produtoAssembler.toDTO(produtoEntity);
    }
}
