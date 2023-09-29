package if_switch;

import java.util.*;




public class if_switch_ej22 {
    public static void main(String[] args) {

        /*
        Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
        minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana
        comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos,
        anterior al viernes a las 15:00h.

         */

        class Crono {
            public static int minutos_restantes(String tiempo){

                //creo un método para obtener los minutos restantes del día que me dan
                //Para el viernes no vale ya que el no va a valer 24 h

                //Creo una lista con el parámetro tiempo, con dos elementos de hacer split de las horas y los minutos por los dos puntos
                ArrayList<String> hora_y_minuto= new ArrayList<String>(List.of(tiempo.split(":")));

                return (24*60)-((Integer.parseInt(hora_y_minuto.get(0)))*60+(Integer.parseInt(hora_y_minuto.get(1))));
            }

            public static int minutos_restantes_viernes(String tiempo){
                //creo un método específico para l viernes
                //Creo una lista con el parámetro tiempo, con dos elementos de hacer split de las horas y los minutos por los dos puntos
                ArrayList<String> hora_y_minuto= new ArrayList<String>(List.of(tiempo.split(":")));
                return (15*60)-((Integer.parseInt(hora_y_minuto.get(0)))*60+(Integer.parseInt(hora_y_minuto.get(1))));
            }
        }


        //String[] dias= {"lunes", "martes", "miércoles", "jueves", "viernes"};

        int minutos_viernes= 15*60; //calculo los minutos que tiene el viernes hasta las 15.00h

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un día de la semana:\n");
        String dia=leer.next();
        System.out.println("Introduzca una hora y sus minutos separados por dos puntos (:)\n");
        String hora= leer.next();


        int minutos_hasta_finde =0; //minutos que quedan hasta el finde

        if (dia.equalsIgnoreCase("lunes")) {
            int minutos_dia = Crono.minutos_restantes(hora);
            minutos_hasta_finde = minutos_dia +minutos_viernes+(3*24*60);
        }

        if (dia.equalsIgnoreCase("martes")) {
            int minutos_dia = Crono.minutos_restantes(hora);
            minutos_hasta_finde = minutos_dia +minutos_viernes+(2*24*60);
        }

        if (dia.equalsIgnoreCase("miercoles")) {
            int minutos_dia = Crono.minutos_restantes(hora);
            minutos_hasta_finde = minutos_dia +minutos_viernes+(24*60);
        }

        if (dia.equalsIgnoreCase("jueves")) {
            int minutos_dia = Crono.minutos_restantes(hora);
            minutos_hasta_finde = minutos_dia +minutos_viernes;
        }
        if (dia.equalsIgnoreCase("viernes")) {
            minutos_hasta_finde = Crono.minutos_restantes_viernes(hora);
        }


        System.out.println("Para el fin de semana quedan "+ minutos_hasta_finde +" minutos" );


    }
}
