package org.waosorio.functionalprogramming.functions;

import org.waosorio.functionalprogramming.Empleado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class EjercicioBiFunction {

    public static void main(String[] args) {
        /*****INTERFAZ FUNCIONAL Bifunction: Esta interfaz permite realizar transformaciones entre tipos de datos.*****/
        /**
         * La interfaz funcional Bifunction. recibe 2 tipos de datos y los transforma en un tipo de dato de salida,
         * la transformación se hace según la implementación definida en la expresión lambda del método abstracto de la interfaz funcional.
         */

        //EJEMPLO 1:
        BiFunction<String, String, String> bi = (x, y) -> x + y;
        System.out.println(bi.apply("Hello", " World"));

        //EJEMPLO 2:
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Andres", 1200000),
                new Empleado("Adriana", 2200000)
        );
        List<Double> salarios = getListaSalarios((salario, incremento) -> +salario + salario * (incremento / 100), empleados, 5);

        for (double salario : salarios) {
            System.out.println(salario);
        }
    }

    private static List<Double> getListaSalarios(BiFunction<Double, Double, Double> bi, List<Empleado> empleados, double incremento) {
        List<Double> listaSalarios = new ArrayList<>();

        for (Empleado empleado : empleados) {
            listaSalarios.add(bi.apply(empleado.getSalario(), incremento));
        }
        return listaSalarios;
    }

}
