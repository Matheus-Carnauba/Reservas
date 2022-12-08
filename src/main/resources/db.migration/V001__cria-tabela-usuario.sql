CREATE TABLE Usuario(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(200),
    email VARCHAR(200),
    telefone VARCHAR(20),
    senha VARCHAR(15),

    PRIMARY KEY (id)
);