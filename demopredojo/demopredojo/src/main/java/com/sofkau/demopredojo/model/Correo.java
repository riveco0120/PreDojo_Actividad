package com.sofkau.demopredojo.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Correo {

    private Integer idCorreo;

    private  String correo;

    private Boolean enviado = false;

    private String dominio;

    public Correo() {
    }

    public Correo(Integer idCorreo, String correo, Boolean enviado, String dominio) {
        this.idCorreo = idCorreo;
        this.enviado = enviado;
        this.dominio = dominio;
        this.correo =correo;
    }
}
