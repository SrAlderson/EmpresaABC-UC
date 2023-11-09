package com.empresa.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.demo.model.cargo;

public interface CargoRepository extends JpaRepository <cargo, Integer>{
    
}
