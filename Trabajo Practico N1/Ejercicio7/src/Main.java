import Clases.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }

    public void arranque(){

        List<String> empleados = new ArrayList<>();
        empleados.add("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10");
        empleados.add("nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=10");
        empleados.add("nombre=Pablo ,apellido=Marquez ,legajo=E001, aniosTrabajados=10");
        empleados.add("Nombre=Pablo,apellidO=Marquez ,LEGAJO=E001, ANIOStrabajados=10");
        empleados.add("nombre=Pablo,legajo=E001,aniosTrabajados=10,apellido=Marquez");

        for (String empleado : empleados){
            System.out.println(Empleado.stringToObject(empleado));
        }

        // Excepciones
        System.out.println("\n");

        // Campo faltante
        try {
            Empleado empleado = Empleado.stringToObject("nombre=Pablo, apellido=, legajo=E001, aniosTrabajados=10");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Empleado empleado = Empleado.stringToObject("nombre=Pablo, =Marquez, legajo=E001, aniosTrabajados=10");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // aniosTrabajados igual a 0 o distinto de entero
        try {
            Empleado empleado = Empleado.stringToObject("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=0");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Empleado empleado = Empleado.stringToObject("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10.5");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}