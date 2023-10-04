package arrays_bidir;

import numeros_aleatorios.Aleatorio;

import java.util.Scanner;

public class arrays_bidir_ej09 {
    public static void main(String[] args) {
        /*
        Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
        posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas y debe
        contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original como
        la matriz resultado, ambas con los números convenientemente alineados.
         */

        //la matriz 12x12 es más difícil de apreciar los resultados
        //vamos a hacerllo con una matriz 4x4 con nº aleatorios entre 0 y 9
        //pero la lógica vale también para 12x12

        //almacenamos los num aleatorios e imprimimos el array
        int[][] numeros= new int[4][4];
        for (int fila = 0; fila <numeros.length; fila++){
            for (int colum=0; colum<numeros[fila].length; colum++){
                numeros[fila][colum]= Aleatorio.entero_aleatorio(0, 9);
                System.out.print(numeros[fila][colum]+" ");
            }
            System.out.println();
        }


        //En sentido horario, en una matriz con n filas y n columnas siendo n par:

        // -El centro está formado por 4 casillas
        // -La primera mitad de las columnas gira hacia arriba, la otra hacia abajo
        // -La primera mitad de las filas se desplaza hacia la derecha, la otra hacia la izq

        int almacen_ultima_casilla=0;
        int almacen_celda_actual=0;
        for (int fila=0; fila<numeros.length; fila++){
            for (int columna=0; columna<numeros[fila].length; columna++){
               almacen_ultima_casilla=numeros[fila][numeros[fila].length-1];

                }
            }

            System.out.println();

        //Imprimimos el array
        for (int fila=0; fila<numeros.length; fila++){
            for (int columna=0; columna<numeros[fila].length; columna++){
                System.out.print(numeros[fila][columna]+" ");
            }
            System.out.println();
        }

        //NO

    }
}
