package org.waosorio.functionalprogramming;

public class Comensal {

    private String nombre;
    private double montoPedido;
    private int mesa;

    public Comensal(String nombre, double montoPedido, int mesa) {
        this.nombre = nombre;
        this.montoPedido = montoPedido;
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
