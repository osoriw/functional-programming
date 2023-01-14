package org.waosorio.functionalprogramming.functions;

import org.waosorio.functionalprogramming.Comensal;

import java.util.function.Function;

public class TestFunction {


    public static void main(String[] args) {
        /*****INTERFAZ FUNCIONAL Function: Esta interfaz permite realizar transformaciones entre tipos de datos.*****/
        Function<Integer, String> converter = param -> Integer.toString(param);
        System.out.println(converter.apply(100).length());

        /*****OBTENER DATOS DE UN COMENSAL, USANDO UNA INTERFAZ FUNCIONAL Function*****/
        String nombreComensal = (String) getDatoComensal(new Comensal("Andres", 15000, 12), x -> x.getNombre());
        System.out.println("El nombre de comensal es: " + nombreComensal);
    }

    private static Object getDatoComensal(Comensal comensal, Function<Comensal, Object> function) {
        return function.apply(comensal);
    }

}
