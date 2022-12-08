package com.br.b4lbs.github.reservas.api.controller;


import com.br.b4lbs.github.reservas.api.dto.input.UsuarioInput;
import com.br.b4lbs.github.reservas.api.dto.output.UsuarioDTO;
import com.br.b4lbs.github.reservas.domain.model.Usuario;
import com.br.b4lbs.github.reservas.domain.repository.UsuarioRepository;
import com.br.b4lbs.github.reservas.domain.service.CadastroUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    private CadastroUsuarioService cadastroUsuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO cadastrar(@Valid @RequestBody UsuarioInput usuario) {
        return cadastroUsuarioService.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }
}
