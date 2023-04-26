package Figuras;

import Interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;
    private double x;
    private double y;

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3, double base, double altura, double x, double y) throws IllegalArgumentException {
        if (lado1 < 0 || lado2 < 0 || lado3 < 0 || base < 0 || altura < 0 || x < 0 || y < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws IllegalArgumentException {
        if (lado1 < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws IllegalArgumentException {
        if (lado2 < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws IllegalArgumentException {
        if (lado3 < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.lado3 = lado3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws IllegalArgumentException {
        if (base < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException {
        if (altura < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.altura = altura;
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
        return y;
    }

    public void setY(double y) throws IllegalArgumentException {
        if (y < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.y = y;
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public double calcularSuperficie() {
        return base*altura/2;
    }

    @Override
    public String toString() {
        String resultado = "#### Triangulo ####\n" +
                "Perimetro= " + calcularPerimetro() +"\n"+
                "Superficie= " + calcularSuperficie();
        return resultado;
    }
}
