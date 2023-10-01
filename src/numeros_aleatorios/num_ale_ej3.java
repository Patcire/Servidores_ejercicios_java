package numeros_aleatorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class num_ale_ej3 {
    public static void main(String[] args) {
        /*
        un programa que muestre al azar el nombre de una carta de la baraja francesa
         Se utilizará la baraja de 40 cartas: 2, 3,
        4, 5, 6, 7, sota, caballo, rey y as
         */

        Map<Integer, String> palos = new HashMap<Integer, String>();
        palos.put(1, "bastos");
        palos.put(2, "oro");
        palos.put(3, "espadas");
        palos.put(4, "bastos");

        Map<Integer, String> cartas_especiales = new HashMap<Integer, String>();
        cartas_especiales.put(1, "as");
        cartas_especiales.put(10, "sota");
        cartas_especiales.put(11, "caballo");
        cartas_especiales.put(12, "rey");

        //Obtenemos el nº de la carta, no puede ser ni 8 ni 9, pero lo iniciamos a 8 para que se meta en el bucle
        int num_carta=8;
        while (num_carta==8 || num_carta==9){
                num_carta=Aleatorio.entero_aleatorio(1,12); //reutilizo la función que creé en el ejercicio 1
            }

        //Obtenemos el palo
        int palo_carta=Aleatorio.entero_aleatorio(1,4);

        if (num_carta==1 || num_carta==10 || num_carta==11 || num_carta==12){
            System.out.println("La carta aleatoria creada ha sido: "+cartas_especiales.get(num_carta)+ " de " + palos.get(palo_carta));
        }
        else {
            System.out.println("La carta aleatoria creada ha sido: " + num_carta + " de " + palos.get(palo_carta));
        }


    }
}
