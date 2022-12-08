package com.br.b4lbs.github.reservas.domain.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class ReservasProduto {

    @Column(name = "produto_id")
    private Produto produto;

    @Column(name = "reserva_id")
    private Reservas reserva;

}
