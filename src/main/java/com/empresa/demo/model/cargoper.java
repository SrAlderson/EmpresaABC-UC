package com.empresa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//Librerias para la base de datos

@Entity
@Table(name="cargoperfil")

public class cargoper {
    
    //Atributos del usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID 

    private int idCPE;
    private String nombreperfil;
    private String nombrecargo;   

    //Creacion de la conexion de la tala <cargo_perfil - perfil>
    @ManyToOne
    @JoinColumn
    private perfil perfil;

    //Creacion de la conexion de la tala <cargo_perfil - cargo>
    @ManyToOne
    @JoinColumn
    private cargo cargo;

    //Creacion del metodo constructor vacio
    public cargoper(){

    }

    //Creacion del metodo constructor
    public cargoper(int idCPE, String nombreperfil, String nombrecargo, com.empresa.demo.model.perfil perfil, com.empresa.demo.model.cargo cargo) {
        this.idCPE = idCPE;
        this.nombreperfil = nombreperfil;
        this.nombrecargo = nombrecargo;
        this.perfil = perfil;
        this.cargo = cargo;
    }
    //Creacion de los metodos Getter y Setter
    //Getter
    
    public int getIdCPE() {
        return idCPE;
    }

    public String getNombreperfil() {
        return nombreperfil;
    }

    public String getNombrecargo() {
        return nombrecargo;
    }

    public perfil getPerfil() {
        return perfil;
    }

    public cargo getCargo() {
        return cargo;
    }

    //Setters
    public void setIdCPE(int idCPE) {
        this.idCPE = idCPE;
    }

    public void setNombreperfil(String nombreperfil) {
        this.nombreperfil = nombreperfil;
    }

    public void setNombrecargo(String nombrecargo) {
        this.nombrecargo = nombrecargo;
    }

    public void setPerfil(perfil perfil) {
        this.perfil = perfil;
    }

    public void setCargo(cargo cargo) {
        this.cargo = cargo;
    }
}