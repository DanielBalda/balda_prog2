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

        figuras.add(new Circulo(9, 1, 3));
        figuras.add(new Triangulo(4, 3, 7, 4, 10, 5, 3));
        figuras.add(new Rectangulo(5,8, 10, 3));

        System.out.println("###### Figuras Geometrias ######\n");

        for (FiguraGeometrica figura : figuras){
            System.out.println(figura);
        }

        // Excepciones

        // Circulo

        try {
            FiguraGeometrica figura = new Circulo(-1.0, 2.0, 2.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        Circulo ciculo = new Circulo(5.0, 2.0, 2.0);
        try {
            ciculo.setRadio(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Triangulo

        try {
            FiguraGeometrica figura = new Triangulo(3.0, 4.0, 5.0, -1.0, 1.0, 2.0, 1.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0, 1.0, 1.0, 2.0, 1.0);
        try {
            triangulo.setX(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Rectangulo

        try {
            FiguraGeometrica figura = new Rectangulo(3.0, 4.0, 5.0, -1.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Rectangulo rectangulo = new Rectangulo(3.0, 4.0, 5.0, 1.0);
        try {
            rectangulo.setX(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}