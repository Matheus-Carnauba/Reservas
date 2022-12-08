CREATE TABLE Produto(
    id BIGINT NOT NULL AUTO_INCREMENT,
    usuario_id BIGINT NOT NULL,
    nome_produto VARCHAR(200),
    lote_produto VARCHAR(200),
    fornecedor_produto VARCHAR(200),
    fabricante_produto VARCHAR(200),
    formula_produto VARCHAR(200),
    concentracao_produto VARCHAR(200),
    peso_molecular VARCHAR(200),
    estoque_produto VARCHAR(200),
    situacao_produto VARCHAR(200),
    quantidade_produto INT,
    data_entrada DATETIME,
    data_vencimento DATETIME,

    PRIMARY KEY(id)
);

ALTER TABLE Produto ADD CONSTRAINT fk_produto_usuario
FOREIGN KEY (usuario_id) REFERENCES Usuario (id);