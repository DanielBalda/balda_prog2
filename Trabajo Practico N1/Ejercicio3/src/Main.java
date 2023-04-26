import Clases.Empleado;
import Clases.ListaGenerica;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }

    public void arranque() {
        ListaGenerica<Empleado> empleados = new ListaGenerica<>();

        String[] nombres = "Daniel;Enzo;Marcos;Daniel;Francisco".split(";");
        String[] apellidos = "Balda;Ponce;Diaz;Balda;Espinola".split(";");
        String[] legajos = "54041;65120;64914;54041;23596".split(";");
        String[] aniosTrabajados = "25;40;10;25;30".split(";");

        // Carga la lista generica con objetos Empleado
        for (int indice=0;indice<nombres.length;indice++){
            Empleado empleado = new Empleado();
            empleado.setNombre(nombres[indice]);
            empleado.setApellido(apellidos[indice]);
            empleado.setLegajo(Integer.parseInt(legajos[indice]));
            empleado.setAniosTrabajados(Integer.parseInt(aniosTrabajados[indice]));
            empleados.agregar(empleado);
        }

        // Agrega elemento con indice fuera de rango
        Empleado empleadoNuevo = new Empleado("Mauricio","Sanchez",25494,16);
        empleados.agregar_posicion(empleadoNuevo, 15);

        empleados.obtener_posicion(15);

        empleados.obtener_primer_elemento();
        empleados.obtener_ultimo_elemento();
    }
}