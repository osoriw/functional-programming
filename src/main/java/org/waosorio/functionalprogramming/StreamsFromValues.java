package org.waosorio.functionalprogramming;

import org.waosorio.functionalprogramming.pojos.Estudiante;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lógica que muestra como crear Streams a partir de diferentes tipos de valores.
 */
public class StreamsFromValues {
    public static void main(String[] args) {
        //Creando un Stream a partir de un valor
        Stream<String> stream1 = Stream.of("String1", "String2", "String3", "String4");
        //stream1.forEach(n -> System.out.println(n));// usando una expresión lamnbda
        stream1.forEach(System.out::println);//usando un método referenciado
        System.out.println("\n");

        //Creando un Stream a partir de un arreglo
        String[] array = {"java", "C++", "ruby", "python"};
        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(System.out::println);
        System.out.println("\n");

        //Creando un Stream a partir de un objeto
        Stream<Estudiante> streamEstudiantes = Stream.<Estudiante>builder().add(new Estudiante("13456", 22, 1.62, 3.8)).add(new Estudiante("56166", 18, 1.75, 4.2)).add(new Estudiante("56165", 19, 1.56, 3.5)).build();
        streamEstudiantes.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));
        System.out.println("\n");

        //Creando un Stream de valores númericos y rango
        //IntStream unoAVeinte = IntStream.range(1,21);//el último número no se incluye dentro del rango
        IntStream unoAVeinte = IntStream.rangeClosed(1, 20);//el último número si se incluye dentro del rango
        unoAVeinte.forEach(System.out::println);
        System.out.println("\n");
    }
}
