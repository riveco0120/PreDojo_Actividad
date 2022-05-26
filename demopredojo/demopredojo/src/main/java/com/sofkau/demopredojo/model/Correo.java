package com.sofkau.demopredojo.model;


import ch.qos.logback.core.CoreConstants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Correo {

    private  String correo;

    private Boolean enviado;

    private String dominio;


    public Correo(String correo){
        this.correo =correo;
    }
    public Correo(String correo, Boolean enviado, String dominio) {
        this.enviado = enviado;
        this.dominio = dominio;
        this.correo =correo;
    }

    @Override
    public String toString() {
        return "Correo{" +
                ", correo='" + correo + '\'' +
                ", enviado=" + enviado +
                ", dominio='" + dominio + '\'' +
                '}';
    }
}
