package com.sofkau.demopredojo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;
import ch.qos.logback.classic.Logger;

@NoArgsConstructor
@Data
@SpringBootApplication
public class ConversorPalabras {

    private Flux<String> listaMalasPalabras;




    public String convertirfrase (String frase){
        this.addLista(frase);
        return frase.replace("puto","***")
        .replace("mierda","***")
        .replace("pirobo","***")
        .replace("rayos","***")
        .replace("gonorrea","***")
        .replace("recorcholis","***")
        .replace("maldicion","***")
        .replace("diablos","***")
        .replace("repanpanos","***")
        .replace("pelotudo","***")
        .replace("retrasado","***")
        .replace("coño","***")
        .replace("marica","***");
        
    }

    public void addLista(String frase){
		List<String> listaMalasPalabras = new ArrayList<>();
		listaMalasPalabras.add(frase);

		Flux.fromIterable(listaMalasPalabras).subscribe(p -> log.info(p.toString()));
	}
//No funciono el log final ya que no pude encontrar la importacion correcta

}
