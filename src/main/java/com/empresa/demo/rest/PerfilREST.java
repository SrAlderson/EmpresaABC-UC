package com.empresa.demo.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.demo.model.perfil;
import com.empresa.demo.service.PerfilService;

@RestController
@RequestMapping ("/perfiles")
public class PerfilREST {
    
    @Autowired
    private PerfilService perfilService;

    // Metodo lista todo lo que este creado en la base de datos de la tabla PERFIL
    @GetMapping
    private ResponseEntity <List<perfil>> getAllPerfiles(){
        return ResponseEntity.ok(perfilService.findAll());
    }
}
