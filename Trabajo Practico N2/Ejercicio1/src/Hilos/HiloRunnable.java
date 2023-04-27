package Hilos;

import java.util.Random;

public class HiloRunnable implements Runnable{
    protected String nombre;
    protected int iteraciones;
    protected int delay;

    public HiloRunnable(String nombre, int iteraciones, int delay) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.delay = delay;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i=1;i<=iteraciones;i++){
            int delay = random.nextInt(950) + 50;
            System.out.println("Hilo: \""+this.nombre+"\""+
                    " y esta es la iteracion "+i+
                    " - Demora "+delay+"ms");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
