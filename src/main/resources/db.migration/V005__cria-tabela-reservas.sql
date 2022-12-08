CREATE TABLE Reservas(
    id BIGINT NOT NULL AUTO_INCREMENT,
    data_reserva DATETIME,
    quantidade_alunos INT,

    PRIMARY KEY (id)
);