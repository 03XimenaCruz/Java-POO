package Listas;

import java.util.Collections;
import java.util.LinkedList;

public class ListasEnlazadas {
    public static void main(String[] args) {
        //crear una lista enlazada
        LinkedList<String> Frutas = new LinkedList<>();
        //agregar elementos
        Frutas.add("Manzana");
        Frutas.add("Sandia");
        Frutas.add("Mango");

        //System.out.println("Lista de frutas"+Frutas);
        //Recorrer lista enlazada
        for(Object fruta : Frutas){
            System.out.println(fruta);
        }
        System.out.println("***********************");
        //Agregar valor a una posicion especifica
        Frutas.add(1, "Kiwis");
        for(Object fruta : Frutas){
            System.out.println(fruta);
        }
        System.out.println("***********************");
        //Remover valor a una posicion especifica
        Frutas.remove(1);
        for(Object fruta : Frutas){
            System.out.println(fruta);
        }

        //Sustituir valor de una posicion especifica
        Frutas.set(1,"Platano");
        System.out.println(Frutas);

        //Ordenar lista de frutas
        System.out.println("********");
        Collections.sort(Frutas);
        System.out.println("Lista ordenada alfabeticamente: " + Frutas);

        //Ordenar lista de frutas al reves
        System.out.println("********");
        Collections.reverse(Frutas);
        System.out.println("Lista ordenada alrevez: " + Frutas);

        //ver tamaño de mi lista
        System.out.println("Tamaño de lista: " + Frutas.size());


    }

}
