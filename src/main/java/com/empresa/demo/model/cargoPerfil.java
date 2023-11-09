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
@Table(name="cargoPerfil")

public class cargoPerfil {
    
    //Atributos del usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID 

    private int idCPE;
    private String p_nombre;
    private String c_nombre;   

    //Creacion de la conexion de la tala <cargo_perfil - perfil>
    @ManyToOne
    @JoinColumn
    private perfil perfil;

    //Creacion de la conexion de la tala <cargo_perfil - cargo>
    @ManyToOne
    @JoinColumn
    private cargo cargo;

    //Creacion del metodo constructor
    public cargoPerfil (int idCPE, String p_nombre, String c_nombre, perfil perfil, cargo cargo){
        super();
        this.idCPE = idCPE;
        this.c_nombre = c_nombre;
        this.p_nombre = p_nombre;
        this.perfil = perfil;
        this.cargo = cargo;
    }

    //Creacion de los metodos Getter y Setter
    //Getter
    public int getIdCPE (){
        return idCPE;
    }
    public String getPNombre (){
        return p_nombre;
    }
    public String getCNombre (){
        return c_nombre;
    }
    public perfil perfil (){
        return perfil;
    }
    public cargo cargo (){
        return cargo;
    }

    //Setter
    public void setIdCPE (int idCPE){
        this.idCPE = idCPE;
    }
    public void setCNombre (String p_nombre){
        this.p_nombre = p_nombre;
    }
    public void setPNombre (String c_nombre){
        this.c_nombre=c_nombre;
    }
    public void setPerfil (perfil perfil)    {
        this.perfil = perfil;
    }
    public void setCargo (cargo cargo){
        this.cargo = cargo;
    }
}
