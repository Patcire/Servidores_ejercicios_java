package arrays_bidir;

import java.util.ArrayList;
import java.util.Scanner;

public class arrays_bidir_ej02 {
    public static void main(String[] args) {

        /*
           Escribe un programa que pida 20 números enteros.
     *    Estos números se deben introducir en un array de 4 filas por 5 columnas.
     *    El programa mostrará las sumas parciales de filas y columnas igual que
     *    si de una hoja de cálculo se tratara.
     *    La suma total debe aparecer en la esquina inferior derecha.
     */

        //patricio

        int[][] numeros= new int[4][5];

        Scanner leer = new Scanner(System.in);

        //almacenamos las respuestas
        for (int fila = 0; fila <numeros.length; fila++){
            for (int colum=0; colum<numeros[fila].length; colum++){
                System.out.println("Introduzca un nº:\n");
                int respuesta= leer.nextInt();
                numeros[fila][colum]=respuesta;
            }
        }

        int suma_fila=0;
        int suma_total=0;
        int suma_columnas;
        ArrayList<Integer> almacen_suma_columnas= new ArrayList<>();


        //imprimimos las respuestas y calculamos las sumas
        for (int fila = 0; fila <numeros.length; fila++){

            suma_fila=0; //actualizo la suma cada vez que cambia de fila
            suma_columnas=0;

            for (int colum=0; colum<numeros[fila].length; colum++){

                suma_fila+=numeros[fila][colum];
                System.out.print(numeros[fila][colum]+ " ");

                //para las columnas debemos comprobar que no se salga del index
                if(colum<=numeros.length-1){
                    //recorro todas las casillas de la columna X
                    //recordar que el primer index de numeros son las sublistas, es decir, las filas
                    suma_columnas+=numeros[colum][fila];

                }


            }

            //Acumulamos e imprmimimos las sumas de las filas
            System.out.print("| "); //para separar los datos de las sumas
            System.out.print(suma_fila);

            System.out.println(); //con println cambio de fila

            almacen_suma_columnas.add(suma_columnas);
            suma_total+=suma_fila+suma_columnas;

        }

        almacen_suma_columnas.add(suma_total);
        System.out.println("------------------");

        for (int elemento: almacen_suma_columnas){
            System.out.print(elemento+" ");

        }


    }
}

