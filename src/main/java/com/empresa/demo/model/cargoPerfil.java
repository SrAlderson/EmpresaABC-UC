package com.empresa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

//Librerias para la base de datos

@Entity
@Table(name="cargo_perfil")

public class cargoPerfil {
    
    //Atributos del usuario
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID 

    private int idCPE;
    private String p_nombre;
    private String c_nombre;

    //Creacion del metodo constructor

    public cargoPerfil (int idCPE, String p_nombre, String c_nombre){
        super();
        this.idCPE = idCPE;
        this.c_nombre = c_nombre;
        this.p_nombre = p_nombre;
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

    // Creacion de la conexion con la base de datos
}
