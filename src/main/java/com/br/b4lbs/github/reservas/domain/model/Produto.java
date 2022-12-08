package com.br.b4lbs.github.reservas.domain.model;

import com.br.b4lbs.github.reservas.domain.enums.SituacaoProduto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Produto {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Size(max = 200)
    @Column(name = "nome_produto")
    private String nome;

    @Size(max = 200)
    @Column(name = "lote_produto")
    private String lote;

    @Size(max = 200)
    @Column(name = "fornecedor_produto")
    private String fornecedor;

    @Size(max = 200)
    @Column(name = "fabricante_produto")
    private String fabricante;

    @Size(max = 200)
    @Column(name = "formula_produto")
    private String formula;

    @Size(max = 200)
    @Column(name = "concentracao_produto")
    private String concentracao;

    @Size(max = 200)
    @Column(name = "peso_molecular")
    private String pesoMolecular;

    @Size(max = 200)
    @Column(name = "estoque_produto")
    private String estoque;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao_produto")
    private SituacaoProduto situacao;

    @Column(name = "quantidade_produto")
    private Integer quantidade;

    @Column(name = "data_entrada")
    private OffsetDateTime dataEntrada;

    @Column(name = "data_vencimento")
    private OffsetDateTime dataVencimento;
}
