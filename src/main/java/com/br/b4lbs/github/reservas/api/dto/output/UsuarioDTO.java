package com.br.b4lbs.github.reservas.api.dto.output;


import com.br.b4lbs.github.reservas.domain.model.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private List<Produto> produtos = new ArrayList<>();

}
