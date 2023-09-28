package if_switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class if_switch_ej12 {
    public static void main(String[] args) {
        /*
        Realiza un minicuestionario con 5 preguntas tipo test sobre las asignaturas que se imparten en
        el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación
        obtenida.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println();

        //creo un array que contendrá las 5 preguntas
        ArrayList<String> preguntas= new ArrayList<String>(List.of(
                "1-¿Qué asignatura da Manuel?\n" +
                        "a) DWEC\n" +
                        "b) Fol\n" +
                        "c) Esperanto\n",
                "2-DWEC va sobre:\n" +
                        "a) redes\n" +
                        "b) cocina\n" +
                        "c)desarrollo web en clientes\n",
                "3-¿en 2º se da empresa\n" +
                        "a)sí\n" +
                        "b)no\n?",
                "4-En servidores estamos estudiando:\n" +
                        "a)Java\n" +
                        "b)Python\n",
                "5-CSS se asocia a:\n" +
                        "a)servidor\n" +
                        "b)cliente\n"
                ));

        //ahora un array con las soluciones
        ArrayList<String> soluciones= new ArrayList<String>(List.of("a", "c", "a", "a", "b" ));

        int puntuacion=0;

        for (int i=0; i<5; i++){
            System.out.println(preguntas.get(i));
            System.out.println("Indique su respuesta:\n");
            String respuesta=leer.next();
            if (respuesta.toLowerCase().equals(soluciones.get(i))){
                puntuacion++;
            }

        }

        System.out.println("Ha obtenido "+puntuacion+ " puntos de 5 posibles");
    }
}
