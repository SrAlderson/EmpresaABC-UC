package com.empresa.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.demo.model.colaborador;

public interface ColaboradorRepository extends JpaRepository <colaborador, Integer>{
    
}
