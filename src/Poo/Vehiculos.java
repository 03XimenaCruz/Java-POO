package Poo;
//***MODIFICADOR DE ACCESO PRIVATE: ACCESIBLE SOLO DENTRO DE LA MISMA CLASE
public class Vehiculos {
    private String marca="Audi";
    void DatosVehiculo(){
        System.out.println("Marca: "+marca);
    }
    public static void main(String[] args) {
        Vehiculos veiculo1 = new Vehiculos();
        veiculo1.DatosVehiculo();


    }
}
