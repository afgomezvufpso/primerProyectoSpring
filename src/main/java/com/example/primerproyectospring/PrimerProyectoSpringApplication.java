package com.example.primerproyectospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerProyectoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimerProyectoSpringApplication.class, args);
        System.out.println("Rama creada: Andrés Gómez");

        // Llamado de la función helloWorld
        helloWorld();
        helloWorldNombre("Natalia");
    }

    // Función que imprime Hello World
    public static void helloWorld() {
        System.out.println("Hello World! de Jordy");
    }

    // Función que imprime Hello World
    public static void helloWorldNombre(String nombre) {
        System.out.println("Hello World!" + nombre);
    }

}
