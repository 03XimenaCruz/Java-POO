package Polimorfismo;

public class Animal {
    void sonido(){
        System.out.println("Sonido del animal");
    }
}

class Perro extends Animal {
    void sonido(){
        System.out.println("El perro hace wau wau");
    }
}
class Gato extends Animal {
    void sonido(){
        System.out.println("El gato hace miau");
    }
}
