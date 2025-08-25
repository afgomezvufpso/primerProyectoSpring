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
        helloCruelWorld();
    }

    // Función que imprime Hello World
    public static void helloWorld() {
        System.out.println("Hello World! de Jordy");
    }

    //Funcion que imprime Hello Cruel World
    public static void helloCruelWorld() {
        System.out.println("Hello cruel World! de Natalia");
    }

}
