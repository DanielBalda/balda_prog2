import Hilos.Hilo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }

    public void arranque(){
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            int random = (int) (Math.random()*13)+3;
            numeros.add(random);
        }

        Hilo hilo1 = new Hilo("Hilo 1", numeros);
        hilo1.start();

        List<Integer> numeros2 = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            int random = (int) (Math.random()*13)+3;
            numeros2.add(random);
        }

        Hilo thread1 = new Hilo("Hilo 1", numeros2);
        Hilo thread2 = new Hilo("Hilo 2", numeros2);
        Hilo thread3 = new Hilo("Hilo 3", numeros2);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}