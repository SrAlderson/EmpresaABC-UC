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
@Table(name="colaborador")

public class colaborador {

    //Atributos del usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID 

    private int id;
    private int cedula;
    private int idCPE;
    private String correocorporativo;  
    private String usuariored;

    
    //Creacion de la conexion de la tala <cargo_perfil - perfil>
    @ManyToOne
    @JoinColumn
    private cargoper cargoper;

    //Creacion de la conexion de la tala <cargo_perfil - perfil>
    @ManyToOne
    @JoinColumn
    private usuario usuario;

    //Creacion del metodo contructor vacio
     public colaborador(){
        
     }
    //Creacion del metodo constructor
    public colaborador(int id, int cedula, int idCPE, String correocorporativo, String usuariored, cargoper cargoper, usuario usuario){
        super();
        this.id = id;
        this.cedula = cedula;
        this.idCPE = idCPE;
        this.correocorporativo = correocorporativo;
        this.usuariored = usuariored;
        this.usuario = usuario;
        this.cargoper = cargoper;
    }

    //Creacion de los metodos Get y Set

    //Getters
    public int getId() {
        return id;
    }
    public int getCedula() {
        return cedula;
    }
    public int getIdCPE() {
        return idCPE;
    }
    public String getCorreocorporativo() {
        return correocorporativo;
    }
    public String getUsuariored() {
        return usuariored;
    }
    public cargoper getCargoperfil() {
        return cargoper;
    }
    public usuario getUsuario() {
        return usuario;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void setIdCPE(int idCPE) {
        this.idCPE = idCPE;
    }
    public void setCorreocorporativo(String correocorporativo) {
        this.correocorporativo = correocorporativo;
    }
    public void setUsuariored(String usuariored) {
        this.usuariored = usuariored;
    }
    public void setCargoperfil(cargoper cargoper) {
        this.cargoper = cargoper;
    }
    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }
}
