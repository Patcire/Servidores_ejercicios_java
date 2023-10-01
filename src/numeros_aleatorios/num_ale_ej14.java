package numeros_aleatorios;

import java.util.Scanner;

public class num_ale_ej14 {
    public static void main(String[] args) {

        /*
        Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará
        adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades.
        En cada intento fallido, el programa debe preguntar si el número que estás pensando es
        mayor o menor que el que te acaba de decir. Números aleatorios
         */


        System.out.print("Voy a intentar el número que está pensando\n");
        Scanner leer = new Scanner(System.in);
        int oportunidades=4;
        int limite_por_abajo=0;
        int limite_por_arriba=100;


        while (true) {
            int numero=Aleatorio.entero_aleatorio(limite_por_abajo,limite_por_arriba);
            System.out.println("Digo el "+ numero);
            System.out.println("Es este su número?. Indique con 's' o 'n':\n");
            String respuesta_usuario=leer.next();

            if (respuesta_usuario.equals("s")){
                System.out.println("TOMAAA GANÉEE");
                break;
            }
            else {
                //comprobamos oportunidades restantes

                System.out.println("Me quedan " + oportunidades + " oportunidades");
                if (oportunidades == 0) {
                    System.out.println("He perdido :(");
                    break;
                }

                //y ahora si es mayor o menor
                System.out.println("Tu número es mayor? indicar con 's' o 'n':\n");

                String respuesta2=leer.next();

                if (respuesta2.equals("s")){
                    limite_por_abajo=numero;
                }
                else {
                    limite_por_arriba=numero;
                }
                oportunidades--;
            }
        }

    }
}
