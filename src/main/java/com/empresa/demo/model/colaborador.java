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

    private int colab_id;
    private int usu_cedula;
    private int idCPE;
    private String colab_correo;  
    private String colab_usuario;

    //Creacion de la conexion de la tala <cargo_perfil - perfil>
    @ManyToOne
    @JoinColumn
    private cargoperfil cargoperfil;

    //Creacion de la conexion de la tala <cargo_perfil - perfil>
    @ManyToOne
    @JoinColumn
    private usuario usuario;

    //Creacion del metodo constructor
    public colaborador(int colab_id, int usu_cedula, int idCPE, String colab_correo, String colab_usuario, cargoperfil cargoperfil, usuario usuario){
        super();
        this.colab_id = colab_id;
        this.usu_cedula = usu_cedula;
        this.idCPE = idCPE;
        this.colab_correo = colab_correo;
        this.colab_usuario = colab_usuario;
        this.usuario = usuario;
        this.cargoperfil = cargoperfil;
    }

    //Creacion de los metodos Get y Set

    //Getters
    public int getId(){
        return colab_id;
    }
    public int getUsuCedula(){
        return usu_cedula;
    }
    public int getIdCPE (){
        return idCPE;
    }
    public String getCorreo (){
        return colab_correo;
    }
    public String getUsuario (){
        return colab_usuario;
    }
    public usuario usuario (){
        return usuario;
    }
    public cargoperfil cargoPerfil (){
        return cargoperfil;
    }

    //Setters
    public void setId(int colab_id){
        this.colab_id = colab_id;
    }
    public void setUsuCedula (int usu_cedula){
        this.usu_cedula = usu_cedula;
    }
    public void setIdCPE (int idCPE){
        this.idCPE = idCPE;
    }
    public void setCorreo (String colab_correo){
        this.colab_correo = colab_correo;
    }
    public void setUsuario (String colab_usuario){
        this.colab_usuario = colab_usuario;
    }
    public void setUsuario1 (usuario usuario){
        this.usuario =usuario;
    }
    public void setCargoPerfil(cargoperfil cargoperfil){
        this.cargoperfil = cargoperfil;
    }
}
