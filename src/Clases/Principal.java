package Clases;

import java.util.Scanner;

class Cliente{
    String nombreCliente;

     //constructor
    Cliente(String nombre){
        this.nombreCliente = nombre ;
    }

    String DimeDatos(){
        return nombreCliente;
    }
}

class Prestamo{
    double cuota;
    //constructor
    Prestamo(double cuota1){
        this.cuota = cuota1;
    }
    void Analizacuota(){
        if(cuota>=10000){
            System.out.println("Deuda cancelada");
        }else {
            double pendiente = 10000 -  cuota;
            System.out.println("Abono a deuda: " +  cuota);
            System.out.println("Saldo pendiente: " + pendiente);
        }
    }
}
class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nobre: ");
        Cliente persona1 = new Cliente(entrada.next());
        System.out.println("Ingrese cuota: ");
        Prestamo deposito = new Prestamo(entrada.nextDouble());
        System.out.println(persona1.DimeDatos());
        deposito.Analizacuota();
    }
}
