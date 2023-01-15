package org.waosorio.functionalprogramming.functions;

import org.waosorio.functionalprogramming.Empleado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class EjercicioPredicate {

    public static void main(String[] args) {
        /*****INTERFAZ FUNCIONAL Predicate: Esta interfaz recibe un argumento genérico y devuelve TRUE o FALSE, basado en la evaluación de una condición booleana.*****/
        //EJEMPLO 1: evalua si un entero es mayor o menor que cero.
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

        List<Empleado> salariosAltos = evaluarSalario(empleados, empleado -> empleado.getSalario() > 2000000);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Empleados con salarios mayores a 2 millones:");
        for (Empleado empleado : salariosAltos) {
            System.out.println(empleado.getNombre() + ": " + empleado.getSalario());
        }

        //EJEMPLO 3: se filtran los empleados cn salario mayor a 2000000.
        List<Empleado> empleadosMenores35 = evaluarSalario(empleados, empleado -> empleado.getEdad() < 35);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Empleados menores de 35 anios:");
        for (Empleado empleado : empleadosMenores35) {
            System.out.println(empleado.getNombre() + ": " + empleado.getEdad());
        }

        //EJEMPLO 4: incrementando el salario a los empleados menores de 35 años (uso combinado de BiFunction y Predicate)
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Empleados con incremento salarial:");
        for (Empleado empleado : empleados) {
            if (evaluarEdad(empleado.getEdad(), edad -> edad < 35)) {
                double nuevoSalario = incrementarSalario(empleado, 10, (salario, incremento) -> salario + (salario * incremento / 100));
                empleado.setSalario(nuevoSalario);
                System.out.println(empleado.getNombre() + " " + empleado.getSalario());
            }
        }
    }

    private static List<Empleado> evaluarSalario(List<Empleado> empleados, Predicate<Empleado> pred) {
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (pred.test(empleado)) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }

    private static double incrementarSalario(Empleado empleado, double incremento, BiFunction<Double, Double, Double> bi) {
        return bi.apply(empleado.getSalario(), incremento);
    }

    private static boolean evaluarEdad(double edad, Predicate<Double> predicate) {
        return predicate.test(edad);
    }

}
