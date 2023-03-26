package org.waosorio.functionalprogramming.pojos;

public class Estudiante {

    private String identificacion;
    private int edad;
    private double altura;
    private double promedio;

    public Estudiante(String identificacion, int edad, double altura, double promedio) {
        this.identificacion = identificacion;
        this.edad = edad;
        this.altura = altura;
        this.promedio = promedio;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
