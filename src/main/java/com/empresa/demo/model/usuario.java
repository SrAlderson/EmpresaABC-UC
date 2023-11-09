package com.empresa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Librerias para la base de datos

@Entity
@Table(name="usuario")

public class usuario {
    //Atributos del usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID
    private int id; 
    private String primerNombre; 
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String correo;
    private int cedula;

    //Generacion del Metodo constructor

    public usuario(String primerNombre, String segundoNombre,  String primerApellido, String segundoApellido,  String direccion, String correo, int cedula){
        super();
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.correo = correo;
        this.cedula = cedula;
    }

    //Generacion de Get
    public int getId(){
        return id;
    }
    public String getNombre(){
        return primerNombre;
    }
    public String getNombre2(){
        return segundoNombre;
    }
    public String getApellido(){
        return primerApellido;
    }
    public String getApellido2(){
        return segundoApellido;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getCorreo(){
        return correo;
    }
    public int getCedula(){
        return cedula;
    }

    //Generacion de Set
    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String primerNombre){
        this.primerNombre = primerNombre; 
    }
    public void setNombre2(String segundoNombre){
        this.segundoNombre = segundoNombre;
    }
    public void setApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }
    public void setApellido2 (String segundoApellido){
        this.segundoApellido = segundoApellido;
    }
    public void setDireccion (String direcccion){
        this.direccion = direcccion;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setCedula (int cedula){
        this.cedula = cedula;
    }

    // Creacion de la conexion con la base de datos
}

