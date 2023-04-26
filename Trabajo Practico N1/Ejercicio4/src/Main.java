import Figuras.Circulo;
import Figuras.Rectangulo;
import Figuras.Triangulo;
import Interfaces.FiguraGeometrica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.arranque();
    }

    public void arranque(){
        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(9));
        figuras.add(new Triangulo(4, 3, 7, 4, 10));
        figuras.add(new Rectangulo(5,8));

        System.out.println("###### Figuras Geometrias ######\n");

        for (FiguraGeometrica figura : figuras){
            System.out.println(figura);
        }
    }
}