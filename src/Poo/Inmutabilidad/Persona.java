package Poo.Inmutabilidad;
//***Definir clase con ->final<- para hacerla inmutable
public final class Persona {
    //Definicion de atributos inmutables
    private final String nombre;
    private final int edad;
    protected  final double sueldo;

    public Persona(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String DimeNom() {
        return nombre;
    }
    public int DimeEdad() {
        return edad;
    }
    public double DimeSueldo() {
        return sueldo;
    }

    public static void main(String[] args) {

    }
}
