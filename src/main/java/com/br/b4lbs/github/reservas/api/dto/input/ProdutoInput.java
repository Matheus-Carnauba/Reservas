package com.br.b4lbs.github.reservas.api.dto.input;

import com.br.b4lbs.github.reservas.domain.enums.SituacaoProduto;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class ProdutoInput {

    private String nome;
    private String lote;
    private String fornecedor;
    private String fabricante;
    private String formula;
    private String concentracao;
    private String pesoMolecular;
    private String estoque;
    private SituacaoProduto situacao;
    private Integer quantidade;
    private OffsetDateTime dataVencimento;

}
