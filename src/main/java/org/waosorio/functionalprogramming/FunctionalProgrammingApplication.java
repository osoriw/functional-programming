package org.waosorio.functionalprogramming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.waosorio.functionalprogramming.interfaces.MyInterface1;

@SpringBootApplication
public class FunctionalProgrammingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //forma tipica de implementar una interface con una clase anónima
        MyInterface1 myInterface = new MyInterface1() {
            @Override
            public void accept() {
                System.out.println("My typical implementation");
            }
        };
        myInterface.accept();

        //implementacion de una interface funcional usando una expresión lambda
        MyInterface1 myInterface1 = () -> System.out.println("My implementation with a lambda expression");
        myInterface1.accept();
    }
}
