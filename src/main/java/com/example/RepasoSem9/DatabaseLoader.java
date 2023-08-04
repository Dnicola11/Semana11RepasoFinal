package com.example.RepasoSem9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class DatabaseLoader implements CommandLineRunner {

	private final InstrumentoRepository repositoryI;
	private final MusicoRepository repositoryM;

	@Autowired 
	public DatabaseLoader(InstrumentoRepository repositoryI, MusicoRepository repositoryM) {
		this.repositoryI = repositoryI;
		this.repositoryM = repositoryM;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repositoryI.save(new Instrumento("Guitarra", "Cuerda", "6 cuerdas"));
		this.repositoryI.save(new Instrumento("Ukele", "Cuerda", "4 cuerdas"));
		this.repositoryI.save(new Instrumento("Teclado", "Melodica", "Pequeño"));
		this.repositoryM.save(new Musico("David Nicola"));
	}
}
