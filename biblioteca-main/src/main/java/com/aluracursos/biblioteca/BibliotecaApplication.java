package com.aluracursos.biblioteca;

import com.aluracursos.literalura.main.Main;
import com.aluracursos.literalura.repository.AuthorRepository;
import com.aluracursos.literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner
{

	public static void main(String[] args)
	{
		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Autowired
	private LibroRepository repository;
	@Autowired
	private AuthorRepository authorRepository;
	public void run(String[] args) {
		Main principal = new Main(repository,authorRepository);
		principal.showMenu();
	}
}
