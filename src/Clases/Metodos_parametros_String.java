package Clases;

public class Metodos_parametros_String {
    //metodo set
    void dameDatos(String nombre, int edad){
        System.out.println("Nombre: " + nombre + "\n" +
                            "Edad: " + edad);
    }
    public static void main(String[] args) {
        Metodos_parametros_String persona1 = new Metodos_parametros_String();
        persona1.dameDatos("Mario", 25);

    }
}
