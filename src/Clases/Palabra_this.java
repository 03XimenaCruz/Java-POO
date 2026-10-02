package Clases;

public class Palabra_this {
    String nombre = "Macario";

    String Damenombre (String nombre){
        this.nombre = nombre;
        return nombre;
    }

    void Consultarnombre(){
        System.out.println("Nombre " + nombre);
    }

    public static void main(String[] args) {
        Palabra_this person1 = new Palabra_this();
        person1.Damenombre("Joaquin");
        person1.Consultarnombre();
    }
}
