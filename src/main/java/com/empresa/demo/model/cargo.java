package com.empresa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Librerias para la base de datos

@Entity
@Table(name="cargo")

public class cargo {
    
    //Atributos del usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID 
    private int id; 
    private String cargonombre;
    private String area;
    private String gerencia;

    //Creacion del metodo contructor vacio
     public cargo(){
        
    }
        
    //Generacion del Metodo Constructor
    public cargo(int id, String cargonombre, String area, String gerencia) {
        this.id = id;
        this.cargonombre = cargonombre;
        this.area = area;
        this.gerencia = gerencia;
    }

    //Generacion de los metodos Get y Set

    //Getters
    public int getId() {
        return id;
    }

    public String getCargonombre() {
        return cargonombre;
    }

    public String getArea() {
        return area;
    }

    public String getGerencia() {
        return gerencia;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCargonombre(String cargonombre) {
        this.cargonombre = cargonombre;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

}
