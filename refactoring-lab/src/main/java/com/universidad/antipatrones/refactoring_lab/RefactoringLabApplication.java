package com.universidad.antipatrones.refactoring_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefactoringLabApplication.class, args);
		CatalogoLibros catalogo = new CatalogoLibros();
		RegistroSocios registro = new RegistroSocios();
		ServicioPrestamos prestamos = new ServicioPrestamos(catalogo,
				registro);
		GeneradorReportes reportes = new GeneradorReportes(catalogo,
				registro, prestamos);
		// Misma funcionalidad que antes, pero con responsabilidades separadas
		catalogo.agregar(new Libro("L01", "Clean Code", "Robert Martin"));
		catalogo.agregar(new Libro("L02", "Design Patterns", "Gang of Four"));
		registro.registrar(new Socio("S01", "Ana Torres",
				"ana@uni.edu"));
		prestamos.prestar("L01", "S01");
		reportes.imprimirReporteCompleto();
		prestamos.devolver("L01");
		reportes.imprimirReporteCompleto();
	}

}
