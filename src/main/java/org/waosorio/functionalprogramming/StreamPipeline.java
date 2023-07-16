package org.waosorio.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class StreamPipeline {

    public static void main(String[] args) {
        //Ejemplo de un Stream Pipeline
        List<Integer> enteros = Arrays.asList(1, 2, 3, 4, 5);

        int suma = enteros.stream()              //origen de  datos
                .filter(n -> n % 2 == 0)         //operación intermedia
                .map(n -> n * n)                 //operación intermedia
                .reduce(0, Integer::sum); //operación final

        System.out.println("Suma de enteros pares: " + suma);
    }
}
