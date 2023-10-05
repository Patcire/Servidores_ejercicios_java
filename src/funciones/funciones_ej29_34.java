package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Collections;


public class funciones_ej29_34 {

    // 1. generaArrayBiInt: Genera un array de tamaño n x m con números
    public static int[][] generaArrayBiInt(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        return matriz;
    }


    //1. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
    //parámetro
    public static int[] filaDeArrayBiInt(int[][] matriz, Integer fila) {
        return matriz[fila];
    }

    //1. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
    //pasa como parámetro.
    public static int[] columnaDeArrayBiInt(int[][] matriz, int columna) {
        ArrayList<Integer> array_columna = new ArrayList<>();
        //int[] array_columna= new int[matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == columna) {
                    array_columna.add(matriz[i][j]);
                }
            }
        }
        //paso la Arraylist a int[] con un flujo
        return array_columna.stream().mapToInt(i -> i).toArray();
    }

    // 1. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
    //con dos elementos) de la primera ocurrencia de un número dentro de un array bidimensional. Si
    //el número no se encuentra en el array, la función devuelve el array {-1, -1}.

    public static int[] coordenadasEnArrayBiInt(int[][] matriz, Integer num) {
        int[] coordenadas = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (Objects.equals(matriz[i][j], num)) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                    return coordenadas;
                } else {
                    coordenadas[0] = -1;
                    coordenadas[1] = -1;
                }

            }
        }
        return coordenadas;
    }

        /*
        1. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
        mínimo en su fila y máximo en su columna
         */

    public static boolean esPuntoDeSilla(int[][] matriz, int numero) {

        int[] coordenadas_numero = funciones_ej29_34.coordenadasEnArrayBiInt(matriz, numero);

        if (coordenadas_numero[0] != -1) {
            int[] fila = funciones_ej29_34.filaDeArrayBiInt(matriz, coordenadas_numero[0]);
            int[] columna = funciones_ej29_34.columnaDeArrayBiInt(matriz, coordenadas_numero[1]);

            for (int elemento: fila){
                if (elemento<numero){
                    return false;
                }
            }
            for (int elemento: columna){
                if (elemento>numero){
                    return false;
                }
            }
            return true;
        }

       return false;

    }


    /*
    diagonal: Devuelve un array que contiene una de las diagonales del
    array bidimensional que se pasa como parámetro. Se pasan como parámetros fila, columna y
    dirección. La fila y la columna determinan el número que marcará las dos posibles diagonales
    dentro del array. La dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
    cadena “nose” indica que se elige la diagonal que va del noroeste hacia el sureste(derecha), mientras que la
    cadena “neso” indica que se elige la diagonal que va del noreste hacia el suroeste(izquierda).
     */



    public static int[] diagonal(int[][] matriz, String direccion) {
        int [] diagonal= new int[matriz.length];


        if (direccion.equals("neso")){ //diagonal der a izq

            for (int i=0; i<matriz.length;i++){
                    diagonal[i]=matriz[i][matriz[i].length-1-i];
            }
            return diagonal;
        }
        else if (direccion.equals("nose")){ //diagonal izq a der

            for (int i=0; i<matriz.length;i++){
                diagonal[i]=matriz[i][i];
        }
            return  diagonal;
        }
        return new int[] {-1}; //si la dirección está mal
        }


} //fin clase

