package org.waosorio.functionalprogramming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.waosorio.functionalprogramming.interfaces.*;

@SpringBootApplication
public class FunctionalProgrammingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*****FORMA TIPICA DE IMPLEMENTAR UNA INTERFACE, USANDO UNA CLASE ANONIMA*****/
        MyInterface1 myInterface = new MyInterface1() {
            @Override
            public void accept() {
                System.out.println("My typical implementation");
            }
        };
        myInterface.accept();

        /**
         * ANOTACIONES GENERALES ACERCA DE LA SINTAXIS DE UNA EXPRESION LAMBDA:
         * - Si la expresión lambda tiene un sólo parámetro, se pueden omitir los paréntesis:
         * - Si en el cuerpo de la expresión lambda, se tiene sólo una línea de código, se pueden omitir los llaves.
         * - Si una interfaz funcional tiene retorno de método (return), este se puede omitir en el cuerpo de la expresión lambda.
         * - Hay 4 contextos en los ue podemos usar una expresión lambda:
         *  - Como asignación de una referencia.
         *  - Como argumento de un método (el argumento se define como una expresión lambda).
         *  - Como casting en una invocación (para resolver una ambiguedad de tipo).
         *  - Como retorno de un método.
         */

        /*****IMPLEMENTACION DE UNA INTERFACE FUNCIONAL USANDO UNA EXPRESION LAMBDA*****/
        myInterface = () -> System.out.println("My implementation with a lambda expression");
        myInterface.accept();

        /*****IMPLEMENTACION DE UNA INTERFACE FUNCIONAL USANDO UNA EXPRESION LAMBDA CON UN PARAMETRO*****/
        MyInterface2 myInterface2 = param1 -> System.out.println("param1: " + param1);
        myInterface2.accept(10);

        /*****IMPLEMENTACION DE UNA INTERFACE FUNCIONAL USANDO UNA EXPRESION LAMBDA CON DOS PARAMETROS*****/
        MyInterface3 myInterface3 = (param1, param2) -> System.out.println("param1: " + param1 + " " + "param2: " + param2);
        myInterface3.accept(10, 20);

        /*****IMPLEMENTACION DE LA INTERFACE CALCULADORA USANDO DIFERENTES OPERACIONES*****/
        calcularOperacion(((num1, num2) -> num1 + num2), 20, 10); //la palabra return se puede omitir
        calcularOperacion(((num1, num2) -> num1 - num2), 20, 10);
        calcularOperacion(((num1, num2) -> num1 / num2), 20, 10);
        calcularOperacion(((num1, num2) -> num1 * num2), 20, 10);

        /*****AMBIGUEDAD DE TIPO EN EXPRESIONES LAMBDA*****/
        printer((PrinterStr) param -> System.out.println("Imprimiendo el String: " + param));//se debe declarar explicitamente el tipo de interfaz del argumento para resolver la ambigüedad de tipo
        printer((PrinterInt) param -> System.out.println("Imprimiendo el entero: " + param));

        /*****EXPRESION LAMBDA COMO RETORNO DE METODO*****/
        System.out.println("invocando método create de interface funcional Calculadora: " + create().calcular(5, 10));

        Validador validador = ((num1, num2) -> { return (num1 > num2) ? true : false;});
        System.out.println("Resultado de validación: " +  validador.validar(5, 8));
    }

    public static void calcularOperacion(Calculadora calculadora, int num1, int num2) {
        System.out.println("Resultado de la operación: " + calculadora.calcular(num1, num2));
    }

    public static void printer(PrinterStr printerStr) {
        printerStr.print("Hello World");
    }

    public static void printer(PrinterInt printerInt) {
        printerInt.print(10);
    }

    public static Calculadora create() {
        return (x, y) -> x + y;
    }
}
