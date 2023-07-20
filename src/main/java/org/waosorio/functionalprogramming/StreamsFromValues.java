package org.waosorio.functionalprogramming;

import org.waosorio.functionalprogramming.pojos.Estudiante;

import java.util.stream.Stream;

public class StreamsFromValues {

    public static void main(String[] args) {
        //Creando un stream de un sólo elemento
        Stream<String> string = Stream.of("La programacion funcional es divertida!!\n");
        string.forEach(System.out::println);

        //Creando un stream de más de un elemento
        Stream<String> strings = Stream.of("Hola", "mundo", "java\n");
        strings.forEach(System.out::println);

        //Creando un stream a partir de la operación of, recibiendo como parámetro un arreglo
        String[] lenguajesArr = {"java", "ruby", "node", "c++", "c#\n"};
        Stream<String> lenguajesStrm = Stream.of(lenguajesArr);
        lenguajesStrm.forEach(System.out::println);

        //Creando un stream con el uso del método builder
        Stream<Estudiante> streamEsts = Stream.<Estudiante>builder().add(new Estudiante("n01", 17, 1.70, 9.5)).add(new Estudiante("n02", 25, 1.65, 9.0)).add(new Estudiante("n03", 19, 1.86, 837)).build();

        streamEsts.forEach(est -> System.out.println(est.getIdentificacion()));
    }
}
