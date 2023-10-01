package bucles;

import java.util.Scanner;

public class bucles_ej19 {
    public static void main(String[] args) {
        /*

        Ejerciccio 19:
        Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El
        carácter con el que se pinta la pirámide también se debe pedir por teclado.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un nº de pisos:\n");
        int pisos= leer.nextInt();
        System.out.println("Y un caracter:\n");
        String cadena=leer.next();
        char caracter=cadena.charAt(0);

        for (int niveles=1; niveles<=pisos;niveles++){ //nº de líneas que va a imprimir

            for (int num_caracteres=1; num_caracteres<=niveles; num_caracteres++){ // veces que cada caracter debe imprimirse por nivel


                System.out.print(" "+ caracter);

            }

            System.out.println(""); //salto de nivel

        }

    }
}
