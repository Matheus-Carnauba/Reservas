package com.br.b4lbs.github.reservas.domain.service;

import com.br.b4lbs.github.reservas.api.assembler.UsuarioAssembler;
import com.br.b4lbs.github.reservas.api.dto.input.UsuarioInput;
import com.br.b4lbs.github.reservas.api.dto.output.UsuarioDTO;
import com.br.b4lbs.github.reservas.domain.exception.NegocioException;
import com.br.b4lbs.github.reservas.domain.model.Usuario;
import com.br.b4lbs.github.reservas.domain.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class CadastroUsuarioService {

    private UsuarioRepository usuarioRepository;

    private UsuarioAssembler usuarioAssembler;


    @Transactional
    public UsuarioDTO salvar(UsuarioInput requestUsuario) {
        validaEmail(requestUsuario);
        Usuario usuarioEntity = usuarioAssembler.toEntity(requestUsuario);
        usuarioRepository.save(usuarioEntity);
        return usuarioAssembler.toDTO(usuarioEntity);
    }

    private void validaEmail(UsuarioInput requestUsuario) {
        if (emailEmUso(requestUsuario)) {
            throw new NegocioException("Já existe um usuário cadastrado com este e-mail");
        }
    }

    private boolean emailEmUso(UsuarioInput requestUsuario) {
        return usuarioRepository.findByEmail(requestUsuario.getEmail())
                .stream()
                .anyMatch(usuarioExistente -> !usuarioExistente.equals(requestUsuario));
    }
}
