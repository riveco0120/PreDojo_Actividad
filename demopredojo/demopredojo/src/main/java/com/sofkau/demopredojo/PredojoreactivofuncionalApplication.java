package com.sofkau.demopredojo;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class PredojoreactivofuncionalApplication {

	public static List<String> CrearFrase(){
		List<String>Mensajes  = new ArrayList<>();
		// Scanner scanner = new Scanner(System.in);
		// String Leer = "";

			
		// while(!Leer.equals("salir")){
		// 	System.out.println("Ingresar mensaje");
		// 	Leer = scanner.nextLine();
		// 	Mensajes.add(Leer);
		// }
		Mensajes.add("Hola perro");
		Mensajes.add("HOLA MOTO");
		Mensajes.add("HOLA carro");
		Mensajes.add("Hola abeja");
		return Mensajes;
	}

	public static List<String> MalasPalabras(){
		List<String>Palabrotas = new ArrayList<>();
		Palabrotas.add("perro");
		Palabrotas.add("carro");
		Palabrotas.add("moto");

		return Palabrotas;
	}

	public static void main(String[] args) {
		SpringApplication.run(PredojoreactivofuncionalApplication.class, args);

		List<String>palabrotas = MalasPalabras();
		List<String>mensajes = CrearFrase();
		

		Flux.fromIterable(mensajes).map(mensaje -> {
			palabrotas.forEach(palabrota ->{
				if(mensaje.toUpperCase().contains(palabrota.toUpperCase())){
					mensaje.replace(palabrota.toUpperCase(), "****");
					
				}
			});
			return mensaje;
		}).subscribe(mensaje -> System.out.println(mensaje));
	}

}
//Despues de empezar desde 0 ahora teniendo mas tiempo de pensar bien formule un codigo que tecnicamente si deberia servir de algo pero aun asi no sé porque se generaba un while infinito ni el porque no se remplazan las palabras. Hice mi mejor esfuerzo