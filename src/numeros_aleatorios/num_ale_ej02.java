package numeros_aleatorios;

import java.util.HashMap;
import java.util.Map;

public class num_ale_ej02 {
    public static void main(String[] args) {

       /*
       Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja
        está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por
        13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
        sería el 1). Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
        */

        Map<Integer, String> palos = new HashMap<Integer, String>();
        palos.put(1, "picas");
        palos.put(2, "corazones");
        palos.put(3, "diamantes");
        palos.put(4, "tréboles");

        Map<Integer, String> cartas_especiales = new HashMap<Integer, String>();
        cartas_especiales.put(1, "A");
        cartas_especiales.put(11, "J");
        cartas_especiales.put(12, "Q");
        cartas_especiales.put(13, "K");

        //Obtenemos el nº de la carta, no puede ser ni 8 ni 9, pero lo iniciamos a 8 para que se meta en el bucle

        int num_carta=Aleatorio.entero_aleatorio(1,13); //utilizo la función que he creado (ver la clase Aleatorio contenida en este paquete)

        //Obtenemos el palo
        int palo_carta=Aleatorio.entero_aleatorio(1,4);

        if (num_carta==1 || num_carta==11 || num_carta==12 || num_carta==13){
            System.out.println("La carta aleatoria creada ha sido: "+cartas_especiales.get(num_carta)+ " de " + palos.get(palo_carta));
        }
        else {
            System.out.println("La carta aleatoria creada ha sido: " + num_carta + " de " + palos.get(palo_carta));
        }


    }
}
