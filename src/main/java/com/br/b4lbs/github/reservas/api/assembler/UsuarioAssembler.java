package com.br.b4lbs.github.reservas.api.assembler;

import com.br.b4lbs.github.reservas.api.dto.input.UsuarioInput;
import com.br.b4lbs.github.reservas.api.dto.output.UsuarioDTO;
import com.br.b4lbs.github.reservas.domain.model.Usuario;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class UsuarioAssembler {

    private ModelMapper modelMapper;

    public UsuarioDTO toDTO(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    public Usuario toEntity(UsuarioInput usuarioInput) {
        return modelMapper.map(usuarioInput, Usuario.class);
    }
}
