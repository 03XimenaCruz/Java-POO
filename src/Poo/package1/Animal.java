package Poo.package1;

public class Animal {
    public String nombre= "Togo";
    //**Protected solo es accesible dentro del mismo paquete y subclases
    protected void camina(){
        System.out.println("Este animal camina");
    }
    public void maulla(){
        System.out.println("Este animal maulla");
    }
}
