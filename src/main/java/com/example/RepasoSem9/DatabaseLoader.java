package com.example.RepasoSem9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class DatabaseLoader implements CommandLineRunner {

	private final InstrumentoRepository repository;

	@Autowired 
	public DatabaseLoader(InstrumentoRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Instrumento("Guitarra", "Cuerda", "6 cuerdas"));
		this.repository.save(new Instrumento("Ukele", "Cuerda", "4 cuerdas"));
		this.repository.save(new Instrumento("Teclado", "Melodica", "Pequeño"));
	}
}
