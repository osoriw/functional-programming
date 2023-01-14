package org.waosorio.functionalprogramming.functions;

import org.waosorio.functionalprogramming.Comensal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunction {


    public static void main(String[] args) {
        /*****INTERFAZ FUNCIONAL Function: Esta interfaz permite realizar transformaciones entre tipos de datos.*****/
        Function<Integer, String> converter = param -> Integer.toString(param);
        System.out.println(converter.apply(100).length());

        /*****OBTENER DATOS DE UN COMENSAL, USANDO UNA INTERFAZ FUNCIONAL Function*****/
        String nombreComensal = (String) getDatoComensal(new Comensal("Andres", 15000, 12), x -> x.getNombre());
        System.out.println("El nombre de comensal es: " + nombreComensal);

        List<Comensal> listaDatosComensales = Arrays.asList(
                new Comensal("Victor", 12500, 41),
                new Comensal("Sandra", 11000, 5),
                new Comensal("Victor", 35000, 12),
                new Comensal("Helena", 22000, 25),
                new Comensal("Julio", 5600, 4));

        /*****OBTENER LA LISTA DE NOMBRES DE COMENSALES, USANDO UNA INTERFAZ FUNCIONAL Function*****/
        List<Object> listaNombresComensales = getDatosComensales(listaDatosComensales, x -> x.getNombre());

        System.out.println("La lista de nombres de los comensales es. ");
        for (Object nombre : listaNombresComensales) {
            System.out.println(nombre);
        }

        /*****OBTENER LA LISTA DE MONTOS DE COMENSALES, USANDO UNA INTERFAZ FUNCIONAL Function*****/
        List<Object> listaMontosComensales = getDatosComensales(listaDatosComensales, x -> x.getMontoPedido());

        System.out.println("La lista de montos de los comensales es. ");
        for (Object monto : listaMontosComensales) {
            System.out.println(monto);
        }
    }

    private static Object getDatoComensal(Comensal comensal, Function<Comensal, Object> function) {
        return function.apply(comensal);
    }

    /**
     * Obtiene la lista transformada de comensales con los datos especificados en la expresion lambda.
     * La utilidad de este método consiste en que se puede personalizar o filtrar sólo los datos especificos que se deseen
     * obtener de una lista de datos, por ejemplo un result list obtenido de una base de datos, de un archivo, un servicio web, etc
     * Proporcionando un mecanismo muy útil para trabajar con subconjuntos de datos.
     *
     * @param listaComensales
     * @param function
     * @return
     */
    private static List<Object> getDatosComensales(List<Comensal> listaComensales, Function<Comensal, Object> function) {
        List<Object> datosComensales = new ArrayList<>();

        for (Comensal comensal : listaComensales) {
            datosComensales.add(function.apply(comensal));
        }
        return datosComensales;
    }
}
