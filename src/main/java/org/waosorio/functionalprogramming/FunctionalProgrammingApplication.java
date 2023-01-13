package org.waosorio.functionalprogramming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionalProgrammingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /**
         * INTERFFACES FUNCIONALES MAS IMPORTANTES DISPONIBLES A PARTIR DE LA VERSION 8 DE JAVA
         */

        /**
         * ANOTACIONES IMPORTANTES ACERCA DE LAS INTERFACES FUNCIONALES:
         * -Una interfaz funcional se puede anotar con @FunctionalInterface, esto es una buena práctica, ya que nos ayuda
         *  a identificar si la interfaz funcional que estamos anotando, cumple con los requerimientos para ser una interfaz funcional.
         * -Las interfaces funcionales que vienen por defecto a partir de la versión 8 de java, se encuentran en el paquete
         *  java.util.function.
         * -
         */

    }
}
