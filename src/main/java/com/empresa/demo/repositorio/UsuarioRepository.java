package com.empresa.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import com.empresa.demo.model.usuario;

public interface UsuarioRepository extends JpaRepository <usuario, Integer>{


}