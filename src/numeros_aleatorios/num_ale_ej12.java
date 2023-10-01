package numeros_aleatorios;

import java.util.Scanner;

public class num_ale_ej12 {
    public static void main(String[] args) {
        /*
        Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii
        entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un carácter.
         */



        for (int i =0; i<30; i++){ //voy a imprimir 30 líneas para llenar la pantalla

            for (int longitud_linea=0; longitud_linea <20; longitud_linea++){ // veces que cada caracter debe imprimirse por nivel

                int num_asci=Aleatorio.entero_aleatorio(32,126);
                char caracter = (char)num_asci;
                System.out.print(" "+ caracter);
            }

            System.out.println(); //salto de nivel


        }


        Scanner leer = new Scanner(System.in);
        System.out.println("");
    }
}
