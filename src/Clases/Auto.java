package Clases;
import Clases.Alumnos;

class Auto {
    String marca, modelo;
    int anio;

    //System.in --> entrada al sistema
    //Scanner entrada = new Scanner(System.in);

    //Constructor sin parametros
    public Auto(){
        marca = "Toyota";
        modelo = "Corolla";
        anio = 2024;
    }
    //Sobrecarga de constructores
    //Metodo construcctor 2 que recibe parametros
    public Auto(String marca, int anio){
        this.marca = marca;
        this.modelo = "vvv";
        this.anio = anio;
    }

    void MostrarInfo(){
        System.out.println("Marca: " + marca +
                            "\n" + "Modelo: " + modelo +
                            "\n" + "Año: " + anio);
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Nissan", 2012);
        auto1.MostrarInfo();
        auto2.MostrarInfo();
        Alumnos alum = new Alumnos();
        alum.nombre = "Lulu";
        System.out.println("Nombre: " + alum.nombre);
    }
}
