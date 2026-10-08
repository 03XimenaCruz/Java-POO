package Listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListaEnteros {
    public static void main(String[] args) {
        //Denifir una lista de tipo array
        //clase ArrayList<Tipo de dato> Nombre de la lista = inicializar lista
        ArrayList<Integer> Valores = new ArrayList<>();
        //agregar elementos a la lista
        Valores.add(13);
        Valores.add(12);
        Valores.add(50);
        Valores.add(69);
        Valores.add(2001);

        for (Object f : Valores) {
            System.out.println("Valor: " + f);
        }
        //se va ingresar el 2002 en la tercera posicion
        Valores.add(3, 2002);
        //sustituir valor en una posicion especifica
        Valores.set(1, 5);
        System.out.println("Elementos: " + Valores);
        //Ordenar una lista
        Collections.sort(Valores);
        System.out.println("Lista ordenada : " + Valores);
        //Ordenar lista de mayor a menor
        Collections.reverse(Valores);
        System.out.println("Lista ordenada de mayor a menor : " + Valores);


        //ver tamaño de mi lista
        System.out.println("Tamaño de la lista: " + Valores.size());

        //ver elemento por posicion
        System.out.println("Elemento: " + Valores.get(2));
        //ver primer elemnto
        //System.out.println("Elemento 1: " + Valores.getFirst());
        //ver ultimo elemento
        //System.out.println("Elemento 1: " + Valores.getLast());

        //Eliminar elementos
        Valores.remove(2);
        System.out.println("Elementos: " + Valores);
       // Valores.removeFirst(); remover primer elemento
        //Valores.removeLast(); elimina ultimo elemento

        //buscar valor especifico --> .contains()
        System.out.println("La lista tiene 20? " + Valores.contains(20));
        //ver indice de un elemento
        System.out.println("Indice del numero 69: " + Valores.indexOf(69));



    }
}
