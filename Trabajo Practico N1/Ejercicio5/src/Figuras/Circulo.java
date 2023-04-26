package Figuras;

import Interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private double radio;
    private double x;
    private double y;

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) throws IllegalArgumentException {
        if (radio < 0 || x < 0 || y < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos.");
        }
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws IllegalArgumentException {
        if (radio < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.radio = radio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.x = x;
    }

    public double getY() {
        if (y < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        return y;
    }

    public void setY(double y) throws IllegalArgumentException {
        this.y = y;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI*radio;
    }
    @Override
    public double calcularSuperficie(){
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public String toString() {
        String resultado = "#### Circulo ####\n" +
                "Perimetro = " + calcularPerimetro() +"\n"+
                "Superficie = " + calcularSuperficie();
        return resultado;
    }
}
