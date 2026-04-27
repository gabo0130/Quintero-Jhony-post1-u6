# Refactoring Lab - Gestor de Biblioteca

Proyecto de laboratorio orientado a identificar y refactorizar anti-patrones de diseno.  
La implementacion actual centraliza varias responsabilidades en una sola clase (`GestorBiblioteca`), lo que permite analizar el problema y proponer mejoras de separacion de responsabilidades.

## Objetivo del laboratorio

- Detectar el anti-patron **God Object** en un caso practico.
- Identificar responsabilidades de negocio mezcladas en una unica clase.
- Establecer una base para aplicar refactorings hacia una arquitectura mas mantenible.

## Responsabilidades identificadas

- **Responsabilidad 1: Gestion del catalogo de libros** (agregar, buscar, listar)
- **Responsabilidad 2: Gestion de socios** (registrar, validar, buscar)
- **Responsabilidad 3: Gestion de prestamos** (prestar, devolver)
- **Responsabilidad 4: Generacion de reportes del sistema**

## Estructura del proyecto

```text
src/main/java/com/universidad/antipatrones/refactoring_lab/
|- GestorBiblioteca.java
|- RefactoringLabApplication.java
```

- `GestorBiblioteca`: clase principal del laboratorio con logica de catalogo, socios, prestamos y reportes.
- `RefactoringLabApplication`: punto de entrada de Spring Boot y ejecucion del flujo de ejemplo.

## Tecnologias

- Java 17
- Spring Boot 4.0.6
- Maven Wrapper (`mvnw`, `mvnw.cmd`)

## Como ejecutar

### Opcion 1: Windows (PowerShell)

```powershell
.\mvnw.cmd spring-boot:run
```

### Opcion 2: Compilar y ejecutar pruebas

```bash
./mvnw clean test
```

## Flujo de ejemplo actual

Al iniciar la aplicacion se ejecuta un escenario de demostracion:

1. Registro de libros.
2. Registro de socio.
3. Prestamo de libro.
4. Impresion de reporte.
5. Devolucion de libro.
6. Nueva impresion de reporte.

## Notas del laboratorio

- Este proyecto esta disenado con proposito academico para practicar refactorizacion.
- La clase `GestorBiblioteca` mantiene datos en memoria usando arreglos de `String[]`, intencionalmente simple para enfocar el ejercicio en diseno.
- No hay persistencia a base de datos en esta version.
