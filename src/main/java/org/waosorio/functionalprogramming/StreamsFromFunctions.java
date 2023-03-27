package org.waosorio.functionalprogramming;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsFromFunctions {

    public static void main(String[] args) {
        /**
         * Creando un Stream para mostrar los números de 1 al 10, para ilustrar la creación de un Stream
         * a partir de un flujo de valores, creado con el método iterate.
         * El método iterate, recibe como argumentos, una semilla y la implementación de la interfaz funcional UnaryOperator
         * UnaryOperator es una especialización de la interfaz funcional Function, que recibe un elemento
         * y devuelve un elemento del mismso tipo.
         */
        Stream<Long> streamUnoAlDiez = Stream.iterate(1L, n -> n + 1).limit(10);
        streamUnoAlDiez.forEach(System.out::println);
        System.out.println("\n");

        //Creando un Stream de los números pares del 1 al 20
        System.out.println("Numeros pares del 1 al 20:");
        Stream.iterate(1L, n -> n + 1)
                .limit(20)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println("\n");

        //Creando un Stream con los primeros 20 números pares, a partir del 1
        System.out.println("Primeros 20 numeros pares, a partir del 1:");
        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);
        System.out.println("\n");

        //Creando un Stream con los primeros 20 números pares, a partir del 200
        System.out.println("Primeros 20 numeros pares, a partir del 200:");
        Stream.iterate(1L, n -> n + 1)
                .skip(200)
                .limit(20)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println("\n");

        //Creando un Stream de números aleatorios
        System.out.println("Numeros aleatorios:");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        //Creando un Stream de enteros aleatorios a partir de la clase Ramdom
        System.out.println("Enteros aleatorios a partir de la clase Ramdom:");
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);

    }
}
