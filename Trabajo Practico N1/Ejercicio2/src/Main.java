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

        // Muestra la lista de objetos
        System.out.println("#### Empleados ####\n");
        for(Empleado empleado: empleados.devolver_lista()){
            System.out.println(empleado);
        }

        // Muestra la cantidad de elementos de la lista
        System.out.println("\nCantidad de elementos en la lista: "+empleados.tamanio());

        // Agrega elemento al inicio de la lista
        Empleado empleadoNuevo = new Empleado("Juan","Perez",15694,10);
        empleados.agregar_principio(empleadoNuevo);
        System.out.println(empleados.obtener_primer_elemento());

        // Ordena la lista
        System.out.println("\nLista ordenada");
        empleados.ordenar_lista();
        for(Empleado empleado: empleados.devolver_lista()){
            System.out.println(empleado);
        }

        // Desordena Lista
        System.out.println("\nLista desordenada");
        empleados.desordenar_lista();
        for(Empleado empleado2: empleados.devolver_lista()){
            System.out.println(empleado2);
        }

        // Agrega elemento a una posicion de la lista
        System.out.println("\nNuevo elemento en posicion 3");
        Empleado empleadoNuevo2 = new Empleado("Mauricio","Sanchez",25494,16);
        empleados.agregar_posicion(empleadoNuevo2, 3);
        for(Empleado empleado2: empleados.devolver_lista()){
            System.out.println(empleado2);
        }

        // Obtener elemento de la lista
        System.out.println("\nElemento en la posicion 4\n"+
                empleados.obtener_posicion(4));

        // Obtener primer elemento
        System.out.println("\nPrimer elemento de la lista\n"
                +empleados.obtener_primer_elemento());

        // Obtener ultimo elemento
        System.out.println("\nUltimo elemento de la lista\n"
                +empleados.obtener_ultimo_elemento());

        // Quitar elemento de la lista
        empleados.remover_objeto(4);
        System.out.println("\nEliminar elemento en la posicion 4\n");
        for(Empleado empleado2: empleados.devolver_lista()){
            System.out.println(empleado2);
        }
    }
}