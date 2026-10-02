package Clases;

public class Automoviles {
    //Atributos
    String marca="Nissan";
    String modelo="Nissan 1";
    int anio= 2026;
    boolean camara = true;

    public static void main(String[] args) {
        //Instanciar (crear) objeto de la clase Automovil
        Automoviles auto1 = new Automoviles();
        System.out.println("Marca: " + auto1.marca);
        System.out.println("Modelo: " + auto1.modelo); //obtiene el atributo
        System.out.println("Año: " + auto1.anio);
        System.out.println("Camara: " + auto1.camara);
    }

}
