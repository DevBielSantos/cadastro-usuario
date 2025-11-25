package com.bielsantos.cadastro_usuario.business;


import com.bielsantos.cadastro_usuario.infrastructure.entitys.Usuario;
import com.bielsantos.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUssuario(Usuario usuario) {
        repository.saveAndFlush(usuario)
    }
}
