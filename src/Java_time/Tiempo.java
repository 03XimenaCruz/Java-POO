package Java_time;

import java.time.LocalTime;

public class Tiempo {
    public static void main(String[] args) {
        //objeto de la clase LocaTime Obtener hora actual ->.now
        LocalTime hora = LocalTime.now();
        System.out.println("Hora: " + hora);
        //crear hora especifica ->.of
        LocalTime hora2 = LocalTime.of(12,40,21);
        System.out.println("Hora: " + hora2);

        //Obtener horas,minutos y segundos
        int hh = hora.getHour();
        int mm = hora.getMinute();
        int ss = hora.getSecond();
        System.out.println("Hora: " + hh +" Minutos: " + mm+ " Segundos: " + ss);

        //sumar o restar horas,minutos, segundos
        LocalTime sumahoras = hora.plusHours(2);
        LocalTime menos30min = hora.minusMinutes(30);
        System.out.println("En dos horas son las: " + sumahoras);
        System.out.println("Horas menos 30 minutos: " + menos30min);
    }
}
