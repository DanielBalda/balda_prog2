import Clases.Empleado;
import Clases.EmpleadoSet;

import java.util.*;

//Ejercicio 1
//Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
//Sobrescribir el método toString() para ver una representación entendible de un objeto de la clase
//Crear en la clase de arranque un Set de empleados.
//Crear 5 objetos empleado, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
//Iterar sobre el set y mostrar los objetos empleados
//Crear una herencia de la clase Empleado (EmpleadoSet) y modificarla para que cuando se agreguen EmpleadoSet a un set, los repetidos sean ignorados. Investigar como se hace.
//Crear 5 objetos empleadoSet, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
//Iterar sobre el set y mostrar los objetos empleados. Verificar que el duplicado no existe.

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }

    public void arranque(){
        Set<Empleado> empleados = new LinkedHashSet<>();

        String[] nombres = "Daniel;Julian;Daniel;Marcos;Enzo".split(";");
        String[] apellidos = "Balda;Castillo;Balda;Diaz;Ponce".split(";");
        String[] legajos = "54041;54601;54041;65402;65480".split(";");
        String[] aniosTrabajados = "15;20;15;2;23".split(";");

        System.out.println("\n##### Lista Con Repetidos ####\n");

        for (int indice=0;indice<nombres.length;indice++){
            Empleado empleado = new Empleado();
            empleado.setNombre(nombres[indice]);
            empleado.setApellido(apellidos[indice]);
            empleado.setLegajo(Integer.parseInt(legajos[indice]));
            empleado.setAniosTrabajados(Integer.parseInt(aniosTrabajados[indice]));
            empleados.add(empleado);
        }

        for(Empleado empleado:empleados){
            System.out.println(empleado);
        }

        System.out.println("\n##### Lista Sin Repetidos ####\n");

        Set<EmpleadoSet> empleados2 = new LinkedHashSet<>();

        for (int indice=0;indice<nombres.length;indice++){
            EmpleadoSet empleado = new EmpleadoSet();
            empleado.setNombre(nombres[indice]);
            empleado.setApellido(apellidos[indice]);
            empleado.setLegajo(Integer.parseInt(legajos[indice]));
            empleado.setAniosTrabajados(Integer.parseInt(aniosTrabajados[indice]));
            empleados2.add(empleado);
        }

        for(EmpleadoSet empleado:empleados2){
            System.out.println(empleado);
        }
    }
}