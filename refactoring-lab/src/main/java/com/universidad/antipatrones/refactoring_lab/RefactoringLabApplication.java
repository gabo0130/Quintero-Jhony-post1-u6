package com.universidad.antipatrones.refactoring_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefactoringLabApplication.class, args);
		GestorBiblioteca gestor = new GestorBiblioteca();
		gestor.agregarLibro("L01", "Clean Code", "Robert Martin");
		gestor.agregarLibro("L02", "Design Patterns", "Gang of Four");
		gestor.registrarSocio("S01", "Ana Torres", "ana@uni.edu");
		gestor.realizarPrestamo("L01", "S01");
		gestor.imprimirReporteCompleto();
		gestor.devolverLibro("L01");
		gestor.imprimirReporteCompleto();
	}

}
