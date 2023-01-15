package org.waosorio.functionalprogramming.functions;

import org.waosorio.functionalprogramming.Empleado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class EjercicioPredicate {

    public static void main(String[] args) {
        /*****INTERFAZ FUNCIONAL Predicate: Esta interfaz recibe un argumento genérico y recibe un valor booleano.*****/
        //EJEMPLO 1: la expresión lambda recibe un entero y devuelve un TRUE o FALSE, dependiendo de si el valor es mayor o menos que cero
        Predicate<Integer> predicate = x -> x > 0;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(predicate.test(1)); //su método abstracto se llama test.
        System.out.println(predicate.test(-1));

        //EJEMPLO 2: se filtran los empleados cn salario mayor a 2000000.
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Andres", 25, 1200000, "Cobranzas"),
                new Empleado("Alicia", 36, 3000000, "Ventas"),
                new Empleado("Esteban", 45, 1000000, "Mostrador"),
                new Empleado("Lina", 32, 1100000, "Telemarketing"),
                new Empleado("Damaris", 55, 3200000, "Gerencia")
        );

        List<Empleado> salariosAltos = evaluate(empleados, empleado -> empleado.getSalario() > 2000000);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Empleados con salarios mayores a 2 millones:");
        for (Empleado empleado : salariosAltos) {
            System.out.println(empleado.getNombre() + ": " + empleado.getSalario());
        }

        //EJEMPLO 2: se filtran los empleados cn salario mayor a 2000000.
        List<Empleado> empleadosMenores35 = evaluate(empleados, empleado -> empleado.getEdad() < 35);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Empleados menores de 35 anios:");
        for (Empleado empleado : empleadosMenores35) {
            System.out.println(empleado.getNombre() + ": " + empleado.getEdad());
        }

    }

    private static List<Empleado> evaluate(List<Empleado> empleados, Predicate<Empleado> pred) {
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (pred.test(empleado)) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }

}
