package com.sofkau.demopredojo.domain;

import com.sofkau.demopredojo.model.Correo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.transform.FieldVisitorTee;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;


public class DomainCorreo {

    private List<Correo> listaCorreo = new ArrayList<>();
    private static final Logger log = LoggerFactory.getLogger(DomainCorreo.class);


    public List<Correo> listCorreos() {

        listaCorreo.add(new Correo("cathita_acostahotmail.com", false, "hotmail"));
        listaCorreo.add(new Correo("ambrosio82@gmail.com", true, "gmail"));
        listaCorreo.add(new Correo("carolaasm@hotmail.com", false, "hotmail"));
        listaCorreo.add(new Correo("danycast98@hotmail.com", true, "hotmail"));
        listaCorreo.add(new Correo("marjobio@hotmail.com", false, "hotmail"));
        listaCorreo.add(new Correo("mldelgadillo.v@hotmail.com", true, "hotmail"));
        listaCorreo.add(new Correo("Lorena_firu@yahoo.es", false, "yahoo"));
        listaCorreo.add(new Correo("mgajardo@utalca.cl", false, "utalca"));
        listaCorreo.add(new Correo("jgutierrezp@santotomas.cl", true, "santotmas"));
        listaCorreo.add(new Correo("emarin@upla.cl", false, "upla"));
        listaCorreo.add(new Correo("marcelita@amqualitas.cl", false, "amquealistas"));
        listaCorreo.add(new Correo("rmerino@amqualitas.cl", true, "amquealistas"));
        listaCorreo.add(new Correo("marjobio@hotmail.com", false, "hotmail"));
        listaCorreo.add(new Correo("neilorange2952@yahoo.com", true, "yahoo"));
        listaCorreo.add(new Correo("orregoldi@hotmail.com", false, "udelmar"));
        listaCorreo.add(new Correo("Judith.rabuco@udelmar.cl", true, "udelmar"));
        listaCorreo.add(new Correo("t_soto@dsvalpo.cl", false, "dsvalpo"));
        listaCorreo.add(new Correo("rvaldes@udec.cl", true, "udec"));
        listaCorreo.add(new Correo("hvargas@unab.cl", false, "unab"));
        listaCorreo.add(new Correo("carlos_verdugo@yahoo.es", false, "yahoo"));
        listaCorreo.add(new Correo("alejandrayanezpezoa@gmail.com", true, "gmail"));
        listaCorreo.add(new Correo("rmerino@amqualitas.cl", false, "amqualitas"));
        listaCorreo.add(new Correo("maeillanes@hotmail.com", true, "hotmail"));
        listaCorreo.add(new Correo("osabarca@hotmail.com", false, "hotmail"));
        listaCorreo.add(new Correo("cabrigo@garmendia.cl", true, "garmendia"));
        listaCorreo.add(new Correo("Sb.nashxo.sk8@hotmail.com", false, "hotmail"));
        listaCorreo.add(new Correo("fran.afull@live.cl", false, "live"));
        listaCorreo.add(new Correo("carlosaguileram@hotmail.com", false, "hotmail"));
        listaCorreo.add(new Correo("sandramorales@hotmail.com", true, "hotmail"));
        listaCorreo.add(new Correo("sandramoraleshotmail.com", true, "hotmail"));
        return listaCorreo;
    }

    List<Correo> correoList = this.listCorreos();


    public void filtrarCorreos() {
        Flux.fromIterable(correoList).map(item -> item.getCorreo()).distinct().subscribe(p -> log.info(p.toString()));

    }

    public void filtrarPorDomain(String dominio) {
        Flux.fromIterable(correoList)
                .filter(item -> item.getDominio().contains(dominio)).subscribe(p -> log.info(p.toString()));


    }

    public void cantidaPorDomain(String dominio) {
        Disposable cantidad = Flux.fromIterable(correoList)
                .filter(item -> item.getDominio().contains(dominio)).count().subscribe(p -> log.info(p.toString()));

        System.out.println(cantidad);

    }

    public void cambiarEstado(Boolean estado) {
        Flux.fromIterable(correoList).filter(item -> item.getEnviado() == true)
                .map(item -> {
                    item.setEnviado(estado);
                    return item;
                }).subscribe(p -> log.info(p.toString()));
    }

    public void cantidadCorreo() {
        Disposable cantidad = Flux.fromIterable(correoList).count().subscribe(p -> log.info(p.toString()));

        System.out.println(cantidad);

    }

    public void verificarcorreo() {
        Flux.fromIterable(correoList)
                .map(item->{
                    if(item.getCorreo().contains("@")){
                        return "El correo es valido";
                }
                    return "El correo no es valido";
                }).subscribe(p->log.info(p.toString()));

    }

}





