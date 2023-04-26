package Figuras;

import Interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;

    public Triangulo(double lado1, double lado2, double lado3, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
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
