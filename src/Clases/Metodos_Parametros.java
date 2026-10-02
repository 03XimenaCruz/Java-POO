package Clases;

class Metodos_Parametros {

    int sumar (int a, int b){
        return a+b;
    }

    int restar (int a, int b){
        return a-b;
    }
    double exponente (double base, double exponente){
        return Math.pow(base,exponente);
    }

    public static void main(String[] args) {
        Metodos_Parametros obj1 = new Metodos_Parametros();
        System.out.println("Total: " + obj1.sumar(10,20));
        System.out.println("Restar: " + obj1.restar(100,20));
        System.out.println("Exponente: " + obj1.exponente(10,3));
    }
}
