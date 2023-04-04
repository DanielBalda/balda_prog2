import Clases.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.inicio();
        //m.test();
    }

    public void inicio() {
        System.out.flush();
        List<String> nombres = new ArrayList<>();

        nombres.add("Daniel");
        nombres.add("Enzo");
        nombres.add("Francisco");
        nombres.add("Julian");
        nombres.add("Marcos");

        List<String> apellidos = new ArrayList<>();

        apellidos.add("Balda");
        apellidos.add("Ponce");
        apellidos.add("Espinola");
        apellidos.add("Castillo");
        apellidos.add("Diaz");

        List<Persona> personas = new ArrayList<>();

        for(int indice = 0; indice < nombres.size(); indice++){
            Persona persona = new Persona();
            persona.setNombre(nombres.get(indice));
            persona.setApellido(apellidos.get(indice));
            persona.setEdad((int) (Math.floor(Math.random()*(50-20+1)+20)));
            personas.add(persona);
        }

        System.out.println("### Lista de personas ###\n");
        int edad = 0;
        int indice = 0;
        for(Persona persona: personas){
            System.out.println(persona);
            if(persona.getEdad() > edad){
                edad = persona.getEdad();
                indice = personas.indexOf(persona);
            }
        }
        System.out.println("\nLa persona mayor es: "+personas.get(indice));
    }

    public void test(){
        List<String> nombres = new ArrayList<>();
        String[] nombresString = "Daniel;Enzo;Julian;Francisco;Marcos".split(";");

        List<String> apellidos = new ArrayList<>();
        String[] apellidosString = "Balda;Ponce;Castillo;Espinola;Diaz".split(";");

        for(String nombre:nombresString){
            nombres.add(nombre);
        }
        for(String apellido:apellidosString){
            apellidos.add(apellido);
        }

        List<Persona> personas = new ArrayList<>();

        for(int indice=0;indice<nombres.size();indice++){
            Persona persona = new Persona();
            persona.setNombre(nombres.get(indice));
            persona.setApellido(apellidos.get(indice));
            persona.setEdad((int) (Math.random() * (50-20)) + 20);
            personas.add(persona);
        }

        System.out.println("#### Listado de Personas ####");
        int edad = 0;
        int indice = 0;
        for(Persona persona:personas){
            System.out.println(persona);
            if(persona.getEdad() > edad){
                edad = persona.getEdad();
                indice = personas.indexOf(persona);
            }
        }

        System.out.println("#### Persona Mayor ####\n"+personas.get(indice));
    }
}