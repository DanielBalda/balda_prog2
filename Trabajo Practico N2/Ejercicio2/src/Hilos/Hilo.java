package Hilos;

import java.util.List;

public class Hilo extends Thread{
    protected String nombre;
    protected List<Integer> numeros;

    public Hilo(String nombre, List<Integer> numeros) {
        this.nombre = nombre;
        this.numeros = numeros;
    }

    @Override
    public void run() {
        while (!numeros.isEmpty()) {
            int elemento = numeros.remove(0);
            int resultado = factorial(elemento);
            int remaining = numeros.size();

            System.out.println("Hilo: "+this.nombre+
                    " procesando la lista. Valor a calcular: "+elemento+
                    ". Resultado: "+resultado+
                    ". Quedan "+remaining+
                    " elementos en la lista por procesar.");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int factorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
