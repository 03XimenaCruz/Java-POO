package Herencia;
import Herencia.*;
public class Principal {
    public static void main(String[] args) {
        Carro obj1 = new Carro("Golf", "Negro", 2017);
        obj1.dameinfo();
        System.out.println("***MOTOCICLETA***");
        Moto obj2 = new Moto("Italica", "DM150",2015);
        obj2.dameinfo();
    }
}

