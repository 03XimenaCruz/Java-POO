package Clases;

class Persona {
    String nombre= "Karla";
    int edad = 19;
    double peso=65.2;
    boolean soltero = true;

    //Crear un metodo GET (siempre lleva return)
    String DimeNombre(){
        return "El nombre es: " + nombre;
    }
    int DimeEdad(){
        return edad;
    }

    //****Crear metodo set no retorna nada
    void  DimePeso(){
        if(peso>70 && edad>30){
            System.out.println(nombre+ " Debe hacer ejercicio");
        }else {
            System.out.println(nombre+ " Esta bien de peso");
        }
    }


    public static void main(String[] args) {
        //Objeto
        Persona persona1 = new Persona();
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println(persona1.DimeNombre());
        System.out.println(persona1.DimeEdad()); //asi se llama un metodo get
        persona1.DimePeso(); //asi se llama el metodo set



    }
}
