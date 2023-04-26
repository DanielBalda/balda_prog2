import Clases.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }

    public void arranque(){
        List<Empleado> listaEmpleados = new ArrayList<>();

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
            listaEmpleados.add(empleado);
        }

        Map<String, Empleado> mapaEmpleados = new HashMap<>();
        for (Empleado empleado : listaEmpleados) {
            String clave = empleado.getApellido() + "," + empleado.getNombre();
            mapaEmpleados.put(clave, empleado);
        }

        for (Map.Entry<String, Empleado> entry : mapaEmpleados.entrySet()) {
            String clave = entry.getKey();
            Empleado empleado = entry.getValue();
            System.out.println("###############\nClave: " + clave + "\nObjeto: " + empleado);
        }
    }
}