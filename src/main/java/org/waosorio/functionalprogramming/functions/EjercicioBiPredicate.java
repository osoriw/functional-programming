package org.waosorio.functionalprogramming.functions;

import org.waosorio.functionalprogramming.Empleado;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class EjercicioBiPredicate {

    public static void main(String[] args) {
        /*****INTERFAZ FUNCIONAL BiPredicate: Esta interfaz recibe 2 argumentos genéricos y devuelve TRUE o FALSE, basado en la evaluación de una condición booleana.*****/
        //EJEMPLO 1: usar la interfaz funcional Bipredicate para comparar 2 números enteros:
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
        System.out.println(biPredicate.test(5, 4));
        System.out.println(biPredicate.test(2, 7));
        //EJEMPLO 2:
        /**
         * Se requiere obtener un reporte con todos los empleados que cumplan con alguno de estos 2 conjuntos de criterios:
         * 1) 25 años en adelante y que estén en el departamento de ventas o
         * 2) 25 años en adelante y que estén en mostrador.
         */

        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Rodrigo", 25, 1500, "Cobranzas"),
                new Empleado("Manolo", 30, 1500, "Ventas,
                new Empleado("Cinthia", 20, 2500, "Mostrador"),
                new Empleado("Esteban", 25, 7000, "Ventas"),
                new Empleado("Damaris", 20, 600, "Teemarketing"),
                new Empleado("Lina", 36, 2500, "Mostrador"),
                new Empleado("Nayeli", 41, 10000, "Ventas"),
                new Empleado("Flor", 52, 7000, "Compras"),
                new Empleado("German", 41, 1500, "Facturación"),
                new Empleado("Lidia", 21, 600, "Cobranzas"),
                new Empleado("Eleazar", 52, 600, "Cobranzas"),
                new Empleado("Javier", 62, 600, "Cobranzas"),
                new Empleado("Paola", 19, 1500, "Compras"),
                new Empleado("Ignacio", 32, 1500, "Compras"),
                new Empleado("Rodrigo", 21, 500, "Recursos humanos"),
                new Empleado("Yolanda", 21, 1000, "Ventas"),
                new Empleado("Arturo", 54, 1500, "Cobranzas"),
                new Empleado("Olivia", 28, 562, "Mostrador"),
                new Empleado("Gerardo", 19, 5222, "Mostrador"),
                new Empleado("Richard", 34, 6500, "Mostrador"),
                new Empleado("Manuel", 40, 2000, "Facturación"),
                new Empleado("Jocabed", 21, 4666, "Mostrador"),
                new Empleado("Noe", 43, 1500, "Cobranzas"),
                new Empleado("Salvia", 33, 1500, "Cobranzas"),
                new Empleado("Pablo", 22, 1500, "Cobranzas"),
                new Empleado("Pedro", 55, 1500, "Compras"),
                new Empleado("Adamaris", 44, 10000, "Recursos humanos")
        );


    }
}
