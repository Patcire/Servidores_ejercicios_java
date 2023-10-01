package bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class bucles_ej20 {
    public static void main(String[] args) {

        /*
        Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
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

        ArrayList<Character> almacen_linea = new ArrayList<Character>();

        for (int niveles=1; niveles<=pisos;niveles++){ //nº de líneas que va a imprimir

            for (int num_caracteres=1; num_caracteres<=niveles; num_caracteres++){ // veces que cada caracter debe imprimirse por nivel

                almacen_linea.add(num_caracteres-1, caracter);
            }

            for (int caracter_posicion = 0; caracter_posicion <=niveles-1; caracter_posicion++){
                if (niveles!=1 && niveles!=2 && niveles!=pisos){ //de la condición excluyo esos niveles que no son huecos
                    if (caracter_posicion==0 || caracter_posicion==niveles-1){
                        System.out.print(caracter);
                        }
                    else {
                        System.out.print(" ");
                    }
                }

                else{
                    System.out.print(almacen_linea.get(caracter_posicion));
            }
            }

            System.out.println(""); //salto de nivel
            almacen_linea = new ArrayList<Character>();

        }

    }
}