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
    private String nombre;                                                                    
    private String nombre1;
    private String apellido;
    private String apellido2;
    private String direccion;
    private String correo;  
    private int cedula;

    //Creacion del metodo contructor vacio
    public usuario(){
        
    }

    //Generacion del Metodo constructor
    public usuario(int id, String nombre, String nombre1, String apellido, String apellido2, String direccion, String correo, int cedula) {
        this.id = id;
        this.nombre = nombre;
        this.nombre1 = nombre1;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.correo = correo;
        this.cedula = cedula;
    }

    //Metodos Getters y Setters

    //Metodos Get
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getApellido() {
        return apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCedula() {
        return cedula;
    }

    //Metodos Set

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
        
}

