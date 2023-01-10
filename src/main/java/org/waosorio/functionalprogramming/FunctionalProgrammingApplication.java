package org.waosorio.functionalprogramming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionalProgrammingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //forma tipica de implementar una interface con una clase anónima
        MyInterface myInterface = new MyInterface() {
            @Override
            public void accept() {
                System.out.println("My typical implementation");
            }
        };
        myInterface.accept();

        //implementacion de una interface funcional usando una expresión lambda
        MyInterface myInterface1 = () -> System.out.println("My implementation with a lambda expression");
        myInterface1.accept();
    }
}
