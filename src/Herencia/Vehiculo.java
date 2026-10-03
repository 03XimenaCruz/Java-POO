package Herencia;
//Vehiculo: Super clase
public class Vehiculo {
    //atributos comunes
    String marca, modelo;
    int anio;
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void dameinfo(){
        System.out.println("Marca: "+marca + "\n"+
                           "Modelo: " + modelo+ "\n"+
                            "Año: " + anio);
    }
}

//Carro: subclase
class Carro extends Vehiculo{
    int ruedas; // atributo propio de la clase Carro
    public Carro(String marca, String modelo, int anio) {
        super(marca, modelo, anio); //Hereda lo del constructor(atributos)
        this.ruedas = 4;
    }

    public void dameinfo(){
        System.out.println("Informacion del auto:");
        System.out.println("Ruedas: "+ruedas);
        super.dameinfo(); //heredar metodos
    }

}

class Moto extends Vehiculo{
    int ruedas;
    public Moto(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.ruedas = 2;
    }

    public void dameinfo(){
        super.dameinfo();
        System.out.println("Ruedas: "+ruedas);
    }
}
