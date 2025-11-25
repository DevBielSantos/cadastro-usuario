package com.bielsantos.cadastro_usuario.infrastructure.repository;

import com.bielsantos.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
