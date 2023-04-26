package Figuras;

import Interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
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
