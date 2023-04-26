package Figuras;

import Interfaces.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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
