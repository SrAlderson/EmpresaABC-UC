package com.empresa.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import com.empresa.demo.model.perfil;

public interface PerfilRepository extends JpaRepository <perfil, Integer> {
    
}
