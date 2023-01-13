package org.waosorio.functionalprogramming.functions;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        /*****INTERFAZ FUNCIONAL Function*****/
        Function<Integer, String> converter = param -> Integer.toString(param);
        System.out.println(converter.apply(100).length());
    }
}
