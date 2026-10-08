package Interfaces;

//Denifir una interfaz
interface Animal {
    //los atributos de una interfaz son tomados por defecto como ---> final
    //atributos de interfaz
    //Siempre se deben inicializar los atributos
    String nombre = "Togo";
    int peso = 150;

    //Los metodos declarados en una interfaz se manejan como metodos abstractos
    void Sonido();

    void Moverse();
}
interface Animal2{
    void Correr();
}
//Utilizar metodos y atributos de la interfaz Animal
//Obligatorio utilizar los metodos que estan en la interfaz
class Ballena implements Animal, Animal2 {
    @Override //Sobreescritura del metodo
    public void Sonido() {
        System.out.println("La ballena canta");
        System.out.println("Nombre: " + nombre);
    }
    @Override
    public void Moverse() {
        System.out.println("La ballena nada");
    }
    @Override
    public void Correr() {
        System.out.println("La ballena echa carreritas");
    }

}

    public class Principal {
    public static void main(String[] args) {
        Ballena obj1 = new Ballena();
        obj1.Sonido();
        obj1.Moverse();

    }
}

//Implementar mas de 1 interface en una clase
// ----> class Ballena implements Animal, Animal2{}
