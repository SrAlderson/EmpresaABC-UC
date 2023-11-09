package com.empresa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

//Librerias para la base de datos

@Entity
@Table(name="cargo")

public class cargo {

    //Atributos del usuario
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID 
    private int c_idCargo; 
    private String c_nombre;
    private String c_area;
    private String c_gerencia;

    //Generacion del Metodo Constructor
    public cargo (int c_idCargo, String c_nombre, String c_area, String c_gerencia){
        super();
        this.c_idCargo = c_idCargo;
        this.c_nombre = c_nombre;
        this.c_area = c_area;
        this.c_gerencia = c_gerencia;
    }

    //Generacion de los metodos Get y Set

    // Getters
    public int getIdCargo(){
        return c_idCargo;
    }
    public String getNombre(){
        return c_nombre;
    }
    public String getArea(){
        return c_area;
    }
    public String getGerencia(){
        return c_gerencia;
    }

    // Setters 
    public void setIdCargo (int c_idCargo){
        this.c_idCargo = c_idCargo;
    }
    public void setNombre (String c_nombre){
        this.c_nombre = c_nombre;
    }
    public void setArea (String c_area){
        this.c_area = c_area;
    }
    public void setGerencia (String c_gerencia){
        this.c_gerencia = c_gerencia;
    }

    // Creacion de la conexion con la base de datos
}
