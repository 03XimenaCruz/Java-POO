package Class;
//Definicion de una clase abstracta
abstract class Animal{
    //metodo abstracto: no tiene implementacion
    public abstract void hacerSonido();
    //metodo set
    public void dormir(){
        System.out.println("Este animal duerme");
    }
}

class Perro extends Animal{
    //implementacion de metodo de la clase abstracta Animal
    @Override //sobreescribiendo metodo
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }

}

class  Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El gato maulla");
    }

    @Override
    public void dormir() {
        System.out.println("El togo esta durmiendo");
    }
}


public class Abstracta {
    public static void main(String[] args) {
        Animal objPerro = new Perro();
        Animal objGato = new Gato();
        objPerro.hacerSonido();
        objPerro.dormir();
        objGato.dormir();
        objGato.hacerSonido();

    }
}
