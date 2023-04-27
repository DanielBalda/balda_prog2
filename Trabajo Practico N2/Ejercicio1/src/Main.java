import Hilos.Hilo;
import Hilos.HiloRunnable;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }

    public void arranque(){
        Hilo hilo1 = new Hilo("Hilo1");
        Hilo hilo2 = new Hilo("Hilo2");
        Hilo hilo3 = new Hilo("Hilo3");
        Hilo hilo4 = new Hilo("Hilo4");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        HiloRunnable hR1 = new HiloRunnable("HiloR1",15,250);
        HiloRunnable hR2 = new HiloRunnable("HiloR2",20,550);
        HiloRunnable hR3 = new HiloRunnable("HiloR3",33,690);
        HiloRunnable hR4 = new HiloRunnable("HiloR4",48,850);
        Thread hiloR1 = new Thread(hR1);
        Thread hiloR2 = new Thread(hR2);
        Thread hiloR3 = new Thread(hR3);
        Thread hiloR4 = new Thread(hR4);
        hiloR1.start();
        hiloR2.start();
        hiloR3.start();
        hiloR4.start();
    }
}