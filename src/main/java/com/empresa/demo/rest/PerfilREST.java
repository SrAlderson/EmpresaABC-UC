package com.empresa.demo.rest;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    //Metodos de guardado de datos
    @PostMapping
    private ResponseEntity <perfil> savePerfil (@RequestBody perfil perfil){

        perfil perfilNuevo = perfilService.save(perfil);

        //Mandatorio usar el try cath en caso de que haya un error al ingresar a la persona 
        try {
            return ResponseEntity.created(new URI("/perfiles" + perfilNuevo.getId())).body(perfilNuevo);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}

