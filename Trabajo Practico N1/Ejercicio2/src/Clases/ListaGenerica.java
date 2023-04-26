package Clases;

import java.util.ArrayList;
import java.util.Collections;

public class ListaGenerica<T extends Comparable<T>>{

    private final ArrayList<T> elementos;

    public ListaGenerica() {
        elementos = new ArrayList<>();
    }
    public void agregar(T elemento){
        elementos.add(elemento);
    }

    public ArrayList<T>devolver_lista(){
        return elementos;
    }

    public int tamanio(){
        return elementos.size();
    }

    public void agregar_principio(T elemento){
        elementos.add(0,elemento);
    }

    public void ordenar_lista() {
        elementos.sort(Collections.reverseOrder());
    }

    public void desordenar_lista(){
        Collections.shuffle(elementos);
    }

    public void agregar_posicion(T elemento, int indice) {
        elementos.add(indice, elemento);
    }

    public T obtener_posicion(int indice){
        return elementos.get(indice);
    }

    public T obtener_primer_elemento(){
        return elementos.get(0);
    }

    public T obtener_ultimo_elemento(){
        return elementos.get(elementos.size() - 1);
    }

    public void remover_objeto(int indice) {
        elementos.remove(indice);
    }
}
