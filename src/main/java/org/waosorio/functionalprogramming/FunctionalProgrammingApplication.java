package org.waosorio.functionalprogramming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.waosorio.functionalprogramming.interfaces.Calculadora;
import org.waosorio.functionalprogramming.interfaces.MyInterface1;
import org.waosorio.functionalprogramming.interfaces.MyInterface2;
import org.waosorio.functionalprogramming.interfaces.MyInterface3;

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
        ejecutarOperacion(((num11, num2) -> num11 + num2), 20, 10); //notar que no se está usando la palabra return
        ejecutarOperacion(((num11, num2) -> num11 - num2), 20, 10);
        ejecutarOperacion(((num11, num2) -> num11 / num2), 20, 10);
        ejecutarOperacion(((num11, num2) -> num11 * num2), 20, 10);
    }

    public static void ejecutarOperacion(Calculadora calculadora, int num1, int num2) {
        int resultado = calculadora.calcularOperacion(num1, num2);
        System.out.println("Resultado de la operación: " + resultado);
    }

}
