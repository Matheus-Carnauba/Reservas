package com.br.b4lbs.github.reservas.api.dto.input;


import com.br.b4lbs.github.reservas.domain.model.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UsuarioInput {

    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private List<Produto> produtos = new ArrayList<>();

}
