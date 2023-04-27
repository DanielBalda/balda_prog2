package Hilos;

import java.util.Random;

public class Hilo extends Thread{
    protected String nombre;

    public Hilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run(){
        Random random = new Random();
        int iteraciones = random.nextInt(31)+10;
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
