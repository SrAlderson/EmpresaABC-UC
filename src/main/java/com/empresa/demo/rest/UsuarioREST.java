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

import com.empresa.demo.model.usuario;
import com.empresa.demo.service.UsuarioService;

@RestController
@RequestMapping ("/usuarios")
public class UsuarioREST {
    
    @Autowired
    private UsuarioService usuarioService;

    //Metodo de busqueda general
    @GetMapping
    private ResponseEntity <List<usuario>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    //Metodo para guardar informacion 
    @PostMapping
    private ResponseEntity <usuario> saveUsuario (@RequestBody usuario usuario){

        usuario usuarioNuevo = usuarioService.save(usuario);

        //Mandatorio usar el try cath en caso de que haya un error al ingresar a la persona 
        try {
            return ResponseEntity.created(new URI("/usuarios" + usuarioNuevo.getId())).body(usuarioNuevo);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
