package Clases;

class Alumnos {
    String nombre, asignatura;
    int nota;

    //****Crear metodo constructor por defecto
    public Alumnos(){
        //inicializar atruibutos
        nombre = "Togo";
        asignatura = "Español";
        nota = 50;
    }

    String Cambianota(int nuevaNota){
        nota = nuevaNota;
        return "Nueva nota: " + nota;
    }

    void DimeDatos(){
        System.out.println("Nombre: " + nombre
                + "\n" + "Asignatura: " + asignatura +
                "\n" + "Nota: " + nota);
    }



    public static void main(String[] args) {
        Alumnos persona1 = new Alumnos();
        persona1.DimeDatos();
        persona1.Cambianota(100);
        persona1.DimeDatos();


    }
}
