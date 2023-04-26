package Figuras;

import Interfaces.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double x;
    private double y;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double x, double y) throws IllegalArgumentException{
        if (base < 0 || altura < 0 || x < 0 || y < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos.");
        }
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws IllegalArgumentException{
        if (base < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException{
        if (altura < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.altura = altura;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) throws IllegalArgumentException{
        if (x < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.x = x;
    }

    public double getY() throws IllegalArgumentException{
        return y;
    }

    public void setY(double y) {
        if (y < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.y = y;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(base+altura);
    }

    @Override
    public double calcularSuperficie() {
        return base*altura;
    }

    @Override
    public String toString() {
        String resultado = "#### Rectangulo ####\n" +
                "Perimetro= " + calcularPerimetro() +"\n"+
                "Superficie= " + calcularSuperficie();
        return resultado;
    }
}
