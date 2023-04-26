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

    public void agregar_posicion(T elemento, int indice) throws IndexOutOfBoundsException {
        if (indice > elementos.size()) {
            throw new IndexOutOfBoundsException("El indice especificado es mayor que la cantidad de elementos en la lista");
        }
        elementos.add(indice, elemento);
    }

    public T obtener_posicion(int indice) throws IndexOutOfBoundsException{
        if (indice > elementos.size()) {
            throw new IndexOutOfBoundsException("El indice especificado es mayor que la cantidad de elementos en la lista");
        }
        return elementos.get(indice);
    }

    public T obtener_primer_elemento() throws IndexOutOfBoundsException{
        if(elementos.isEmpty()){
            throw new IndexOutOfBoundsException("La lista esta vacia");
        }
        return elementos.get(0);
    }

    public T obtener_ultimo_elemento() throws IndexOutOfBoundsException{
        if(elementos.isEmpty()){
            throw new IndexOutOfBoundsException("La lista esta vacia");
        }
        return elementos.get(elementos.size() - 1);
    }

    public void remover_objeto(int indice) throws IndexOutOfBoundsException {
        if(indice > elementos.size() || indice < elementos.size()){
            throw new IndexOutOfBoundsException("El elemento no esta en la lista");
        }
        elementos.remove(indice);
    }

    // Lista vacia para la excepcion
    public void lista_vacia(){
        elementos.clear();
    }
}
