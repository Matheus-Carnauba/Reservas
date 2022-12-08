CREATE TABLE Rl_reservas_produto(
    produto_id BIGINT,
    reserva_id BIGINT
);

ALTER TABLE Rl_reservas_produto ADD CONSTRAINT fk_Rl_reservas_produto_produto
    FOREIGN KEY (produto_id) REFERENCES Produto (id);

ALTER TABLE Rl_reservas_produto ADD CONSTRAINT fk_Rl_reservas_produto_reservas
    FOREIGN KEY (reserva_id) REFERENCES Reservas (id);