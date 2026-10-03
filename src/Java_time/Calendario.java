package Java_time;

import java.time.LocalDate;

public class Calendario {
    public static void main(String[] args) {
        //Obtener fecha actual
        //Creamos el atributo fecha y con el metodo ->now<- le pasa un valor al atributo
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha: " + fecha);

        //Fecha especifica
        LocalDate fecha2 = LocalDate.of(2021,10,3);
        System.out.println("Fecha2: " + fecha2);

        //obtener informacion de fecha
        int DiaMes = fecha.getDayOfMonth(); //tare el dia actual
        int Mes= fecha.getMonthValue(); //trae el mes actual
        int Anio = fecha.getYear(); //trae el año actual
        System.out.println("Dia: " + DiaMes + " Mes: " + Mes + " Año: " + Anio);

        //Sumar o restas días, meses o años
        //crear objeto de la clas LocalDate
                                            //Indicamos cuantas semanas o meses en el parentesis
        LocalDate prox_semana = fecha.plusWeeks(2);
        LocalDate ultimo_mes = fecha.minusMonths(3);
        System.out.println("Prox_semana: " + prox_semana);
        System.out.println("Ultimo_mes: " + ultimo_mes);


    }
}
