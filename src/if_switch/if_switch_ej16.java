package if_switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class if_switch_ej16 {
    public static void main(String[] args) {

        /*
        Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada
        pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no
        suman puntos. Utili- za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
        del programa.
         */

        //no tenemos el fichero así que nos inventamos las preguntas y respuestas
        //cambio la temática a si tu pareja te quiere

        Scanner leer = new Scanner(System.in);
        System.out.println();

        //creo un array que contendrá las 3 preguntas
        ArrayList<String> preguntas= new ArrayList<String>(List.of(

                "1-¿Te dice te quiero?\n" +
                        "a)no\n" +
                        "b)sí\n",
                "2-Te respeta:\n" +
                        "a) sí\n" +
                        "b) no\n",
                "4-¿Te demuestra su amor?:\n" +
                        "a)no\n" +
                        "b)sí\n"
        ));

        //ahora un array con las soluciones
        ArrayList<String> soluciones= new ArrayList<String>(List.of("b", "a", "b"));

        int puntuacion=0;

        for (int i=0; i<3; i++){
            System.out.println(preguntas.get(i));
            System.out.println("Indique su respuesta:\n");
            String respuesta=leer.next();
            if (respuesta.toLowerCase().equals(soluciones.get(i))){
                puntuacion++;
            }

        }

        if (puntuacion<2){
            System.out.println("Parece una relación tóxica, vales muchx, revisa tu relación\n");
        } else if (puntuacion==2) {
            System.out.println("Parece que sí, pero si has marcado que no te respeta revisa tu relación");
        }
        else {
            System.out.println("Qué bien, me alegro por vosotrxs");
        }

    }
}
