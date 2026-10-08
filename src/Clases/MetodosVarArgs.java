package Clases;

public class MetodosVarArgs {
                            //int: tipo de dato
                             //los 3 puntos le indican al metodo que son valores variables
                            // numeros: variable donde se almacenaran los valores
    public void imprimeNumeros(String mensaje, int...numeros){
        System.out.println(mensaje);
        for( int i: numeros){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        MetodosVarArgs obj = new MetodosVarArgs();
        obj.imprimeNumeros("Valores registrados: ",1,2,3, 56,69);

    }
}
