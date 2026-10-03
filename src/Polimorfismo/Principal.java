package Polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sonido();
        Perro perro = new Perro();
        perro.sonido();
        Gato gato = new Gato();
        gato.sonido();
    }
}
