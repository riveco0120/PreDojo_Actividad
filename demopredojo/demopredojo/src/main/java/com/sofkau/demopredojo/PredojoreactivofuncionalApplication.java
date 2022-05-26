package com.sofkau.demopredojo;

import com.sofkau.demopredojo.domain.DomainCorreo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PredojoreactivofuncionalApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(PredojoreactivofuncionalApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(PredojoreactivofuncionalApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		DomainCorreo domainCorreo = new DomainCorreo();
		//domainCorreo.filtrarCorreos();
		//domainCorreo.filtrarPorDomain("hotmail");
		//domainCorreo.cantidadCorreo();
		//domainCorreo.filtrarPorDomain("hotmail");
		}
	}

