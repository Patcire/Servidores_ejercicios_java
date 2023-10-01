package numeros_aleatorios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class num_ale_ej10 {
    public static void main(String[] args) {

        /*
        Realiza un programa que pinte por pantalla diez líneas formadas por carac- teres. El carácter con
        el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las
        líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
         */

        Map<Integer, String> caracteres = new HashMap<Integer, String>();
        caracteres.put(1, "*");
        caracteres.put(2, "-");
        caracteres.put(3, "=");
        caracteres.put(4, ".");
        caracteres.put(5, "|");
        caracteres.put(6, "@");

        for (int i =0; i<10; i++){
            int numero_caracteres=Aleatorio.entero_aleatorio(1,40);
            int tipo_caracter=Aleatorio.entero_aleatorio(1, 6);



                for (int longitud_linea=0; longitud_linea <numero_caracteres; longitud_linea++){ // veces que cada caracter debe imprimirse por nivel


                    System.out.print(" "+ caracteres.get(tipo_caracter));

                }

                System.out.println(); //salto de nivel


        }



    }
}
