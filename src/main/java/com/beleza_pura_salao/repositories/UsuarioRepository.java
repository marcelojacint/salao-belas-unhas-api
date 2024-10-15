package com.beleza_pura_salao.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beleza_pura_salao.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByEmail(String email); // buscar todos os emails

}
