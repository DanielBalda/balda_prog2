import Clases.Empleado;
import Clases.EmpleadoSet;

import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arrancar();
    }
    public void arrancar() {
        System.out.println("\n\nSet con repetidos");

        Set<Empleado> empleados = new HashSet<>();
        String[] nombres = "Daniel;Enzo;Marcos;Daniel;Francisco".split(";");
        String[] apellidos = "Balda;Ponce;Diaz;Balda;Espinola".split(";");
        String[] legajos = "54041;65120;64914;54041;23596".split(";");
        String[] aniosTrabajados = "25;40;10;25;30".split(";");

        for (int indice=0;indice<nombres.length;indice++){
            Empleado empleado = new Empleado();
            empleado.setNombre(nombres[indice]);
            empleado.setApellido(apellidos[indice]);
            empleado.setLegajo(Integer.parseInt(legajos[indice]));
            empleado.setAniosTrabajados(Integer.parseInt(aniosTrabajados[indice]));
            empleados.add(empleado);
        }

        for(Empleado empleado: empleados){
            System.out.println(empleado);
        }

        // EmpleadosSet
        System.out.println("\n\nSet sin repetidos");

        Set<EmpleadoSet> empleadosSet = new HashSet<>();
        for (int indice=0;indice<nombres.length;indice++){
            EmpleadoSet empleado = new EmpleadoSet();
            empleado.setNombre(nombres[indice]);
            empleado.setApellido(apellidos[indice]);
            empleado.setLegajo(Integer.parseInt(legajos[indice]));
            empleado.setAniosTrabajados(Integer.parseInt(aniosTrabajados[indice]));
            empleadosSet.add(empleado);
        }

        for(EmpleadoSet empleado: empleadosSet){
            System.out.println(empleado);
        }
    }
}