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

    private int usu_id; 
    private String usu_primerNombre;                                                                    
    private String usu_segundoNombre;
    private String usu_primerApellido;
    private String usu_segundoApellido;
    private String usu_direccion;
    private String usu_correo;  
    private int usu_cedula;

    //Generacion del Metodo constructor
    public usuario(String usu_primerNombre, String usu_segundoNombre,  String usu_primerApellido, String usu_segundoApellido,  String usu_direccion, String usu_correo, int usu_cedula){
        super();
        this.usu_primerNombre = usu_primerNombre;
        this.usu_segundoNombre = usu_segundoNombre;
        this.usu_primerApellido = usu_primerApellido;
        this.usu_segundoApellido = usu_segundoApellido;
        this.usu_direccion = usu_direccion;
        this.usu_correo = usu_correo;
        this.usu_cedula = usu_cedula;
    }

    //Generacion de Get
    public int getId(){
        return usu_id;
    }
    public String getNombre(){
        return usu_primerNombre;
    }
    public String getNombre2(){
        return usu_segundoNombre;
    }
    public String getApellido(){
        return usu_primerApellido;
    }
    public String getApellido2(){
        return usu_segundoApellido;
    }
    public String getDireccion(){
        return usu_direccion;
    }
    public String getCorreo(){
        return usu_correo;
    }
    public int getCedula(){
        return usu_cedula;
    }
    

    //Generacion de Set
    public void setId(int usu_id){
        this.usu_id = usu_id;
    }
    public void setNombre(String usu_primerNombre){
        this.usu_primerNombre = usu_primerNombre; 
    }
    public void setNombre2(String usu_segundoNombre){
        this.usu_segundoNombre = usu_segundoNombre;
    }
    public void setApellido(String usu_primerApellido){
        this.usu_primerApellido = usu_primerApellido;
    }
    public void setApellido2 (String usu_segundoApellido){
        this.usu_segundoApellido = usu_segundoApellido;
    }
    public void setDireccion (String usu_direcccion){
        this.usu_direccion = usu_direcccion;
    }
    public void setCorreo(String usu_correo){
        this.usu_correo = usu_correo;
    }
    public void setCedula (int usu_cedula){
        this.usu_cedula = usu_cedula;
    }
        
}

