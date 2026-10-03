package Cajero;

import java.util.Scanner;

public class Cajero {
    int clave, max_transac, max_intentos;
    double balance;
    Scanner entrada = new Scanner(System.in);

    //metodo constructor
    public Cajero(){
        clave = 1234;
        max_transac = 0;
        balance = 10000.00;
        System.out.println("======================== " + "\n" +
                          "Bienvenido /n"+ "=======================");
        System.out.println("Ingresa tu clave de acceso: ");
        int mi_clave = entrada.nextInt();
        while (mi_clave!=clave){
            max_intentos++;
            System.out.println("Contraseña incorrecta, vuelve a ingresar tu contraseña");
            mi_clave = entrada.nextInt();
            if(max_intentos == 2){
                System.out.println("Cantidad de intentos agotados" + "\n"+
                                    "Su usuario a sido bloqueaado");
                System.exit(0);
            }
        }
        MenuOpciones();
    }
    public void MenuOpciones(){
        int opcion, controlmenu=0;
        while (max_transac<=2){
            System.out.println("Selecciona una opción \n"+
                    "1. Consultar balance \n"+
                    "2. Retiro de efectivo \n"+
                    "3. Depósito a cuenta \n"+
                    "4. Salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    Consultar();
                    break;
                case 2:
                    Retiro();
                    break;
                case 3:
                    Deposito();
                    break;
                case 4:
                    Salir();
                    break;
                default:
                        System.out.println("Opcion incorrecta");
                        controlmenu++;
                        if (controlmenu==3){
                            System.out.println("Cantidad de intentos agotados" + "\n"+
                                    "Su usuario a sido bloqueaado");
                            System.exit(0);
                        }
            }
        }
        System.out.println("Excedio el numero maximo de transacciones");
        Salir();
    }

    public  void Transacciones(){
        int valor;
        System.out.println("Deseas realizar otra transacción \n"+
                            "1. Si \n"+
                            "2.No");
        valor = entrada.nextInt();
        if (valor==1){
            MenuOpciones();
        }else {
            Salir();
        }
    }

    public void Consultar(){
        System.out.println("Balance aactual: " + balance);
        max_transac++;
        Transacciones();
    }

    public void Retiro(){
        System.out.println("Idica la cantidad a retirar: ");
        int retiro = entrada.nextInt();
        while (retiro>balance){
            System.out.println("No tiene balance suficiente \n Intente de nuevo");
            retiro = entrada.nextInt();
        }
        balance = balance - retiro;
        Consultar();
        max_transac++;
        Transacciones();
    }

    public void Deposito(){
        System.out.println("Idica la cantidad a depositar: ");
        int deposito = entrada.nextInt();
        balance = balance + deposito;
        Consultar();
        max_transac++;
        Transacciones();
    }

    public void Salir(){
        System.out.println("Vuelva pronto");
        System.exit(0);
    }



    public static void main(String[] args) {
        Cajero objOperacion = new Cajero();
        objOperacion.MenuOpciones();

    }
}
