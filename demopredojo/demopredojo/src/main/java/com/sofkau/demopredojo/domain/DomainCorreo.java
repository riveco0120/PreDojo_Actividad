package com.sofkau.demopredojo.domain;

import com.sofkau.demopredojo.model.Correo;

import java.util.ArrayList;
import java.util.List;

public class DomainCorreo {

    private List<Correo>listaCorreo = new ArrayList<>();

    public List<Correo>listCorreos(){

        listaCorreo.add(new Correo(1,"cathita_acosta@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(2,"ambrosio82@gmail.com",false,"gmail"));
        listaCorreo.add(new Correo(3,"carolaasm@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(4,"danycast98@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(5,"marjobio@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(6,"mldelgadillo.v@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(7,"Lorena_firu@yahoo.es",false,"yahoo"));
        listaCorreo.add(new Correo(8,"mgajardo@utalca.cl",false,"utalca"));
        listaCorreo.add(new Correo(9,"jgutierrezp@santotomas.cl",false,"santotmas"));
        listaCorreo.add(new Correo(10,"emarin@upla.cl",false,"upla"));
        listaCorreo.add(new Correo(11,"marcelita@amqualitas.cl",false,"amquealistas"));
        listaCorreo.add(new Correo(12,"rmerino@amqualitas.cl",false,"amquealistas"));
        listaCorreo.add(new Correo(13,"marjobio@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(14,"neilorange2952@yahoo.com",false,"yahoo"));
        listaCorreo.add(new Correo(15,"orregoldi@hotmail.com",false,"udelmar"));
        listaCorreo.add(new Correo(16,"Judith.rabuco@udelmar.cl",false,"udelmar"));
        listaCorreo.add(new Correo(17,"t_soto@dsvalpo.cl",false,"dsvalpo"));
        listaCorreo.add(new Correo(18,"rvaldes@udec.cl",false,"udec"));
        listaCorreo.add(new Correo(19,"hvargas@unab.cl",false,"unab"));
        listaCorreo.add(new Correo(20,"carlos_verdugo@yahoo.es",false,"yahoo"));
        listaCorreo.add(new Correo(21,"alejandrayanezpezoa@gmail.com",false,"gmail"));
        listaCorreo.add(new Correo(22,"rmerino@amqualitas.cl",false,"amqualitas"));
        listaCorreo.add(new Correo(23,"maeillanes@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(24,"osabarca@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(25,"cabrigo@garmendia.cl",false,"garmendia"));
        listaCorreo.add(new Correo(26,"Sb.nashxo.sk8@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(27,"fran.afull@live.cl",false,"live"));
        listaCorreo.add(new Correo(28,"carlosaguileram@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(29,"ikis_rojo@hotmail.com",false,"hotmail"));
        listaCorreo.add(new Correo(30,"sandramorales@hotmail.com",false,"hotmail"));



        return listaCorreo;
    }

    Flux<Correo> correoList = Flux.fromIterable(listaCorreo);
    public void filtrarCorreos(){
        List<Correo> listaFiltrada = new ArrayList<>();
        Flux.listaFiltrada = Flux.just(correoList).distinct();
    }
}
