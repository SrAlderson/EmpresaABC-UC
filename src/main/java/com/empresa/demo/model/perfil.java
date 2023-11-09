package com.empresa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Librerias para la base de datos

@Entity
@Table(name="perfil")

public class perfil {
    
    //Atributos del usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID 
    private int p_idPerfil; 
    private String p_nombre;
    private String p_rol;
    
    //Creacion del metodo constructor
    public perfil (int p_idPerfil, String p_nombre, String p_rol){
        super();
        this.p_idPerfil = p_idPerfil;
        this.p_nombre = p_nombre;
        this.p_rol = p_rol;
    }

    //Creacion de los metodos Get y Set

    //Getters
    public int getIdCargo (){
        return p_idPerfil;
    }
    public String getNombre (){
        return p_nombre;
    }
    public String getRol (){
        return p_rol;
    }
    
    //Setters
    public void setIdCargo (int p_idPerfil){
        this.p_idPerfil=p_idPerfil;
    }
    public void setNombre (String p_nombre){
        this.p_nombre=p_nombre;
    }
    public void setRol (String p_rol){
        this.p_rol=p_rol;
    }
    
}
