package com.empresa.demo.rest;

import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.demo.model.cargo;
import com.empresa.demo.service.CargoService;

@RestController
@RequestMapping ("/cargos")
public class CargoREST {
    
    @Autowired
    private CargoService cargoService;

    //Metodo para realizar una consulta sobre un ID especifico
    
    @GetMapping ("{id}")
    private ResponseEntity <List<cargo>> getAllCargosByPerfil(@PathVariable("id") int idPerfil){
        return ResponseEntity.ok(cargoService.findAllByCargoID(idPerfil));
    }

   
    //Metodo para guardar informacion 
    @PostMapping
    private ResponseEntity <cargo> saveCargo (@RequestBody cargo cargo){

        cargo cargoNuevo = cargoService.save(cargo);

        //Mandatorio usar el try cath en caso de que haya un error al ingresar a la persona 
        try {
            return ResponseEntity.created(new URI("/cargos" + cargoNuevo.getId())).body(cargoNuevo);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
