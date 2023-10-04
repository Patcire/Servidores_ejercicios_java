package arrays_bidir;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import numeros_aleatorios.Aleatorio;

public class arrays_bidir_ej03 {
    public static void main(String[] args) {
        /*

         3. Modifica el programa anterior de tal forma que los números que se introducen en
         *    el array se generen de forma aleatoria (valores entre 100 y 999).
         */

        int[][] numeros= new int[4][5];

        Scanner leer = new Scanner(System.in);

        //almacenamos los num aleatorios
        for (int fila = 0; fila <numeros.length; fila++){
            for (int colum=0; colum<numeros[fila].length; colum++){
                numeros[fila][colum]=Aleatorio.entero_aleatorio(100, 999);
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