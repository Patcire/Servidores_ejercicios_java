package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class funciones_ej29_34 {

        // 1. generaArrayBiInt: Genera un array de tamaño n x m con números
        public static Integer[][] generaArrayBiInt(int filas, int columnas) {
            Integer[][] matriz = new Integer[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = (int) (Math.random() * 9 + 1);
                }
            }
            return matriz;
        }



        //1. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
        //parámetro
        public static Integer[] filaDeArrayBiInt (Integer[][] matriz, Integer fila){
            return matriz[fila];
        }

        //1. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
        //pasa como parámetro.
        public static ArrayList<Integer> columnaDeArrayBiInt (Integer[][] matriz, Integer columna){
            ArrayList<Integer> array_columna= new ArrayList<>();

            for (int i=0; i< matriz.length; i++){
                for (int j=0; j<matriz[i].length; j++){
                        if (j==columna){
                            array_columna.add(matriz[i][j]);
                        }
                }
            }
            return  array_columna;
        }

        // 1. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
        //con dos elementos) de la primera ocurrencia de un número dentro de un array bidimensional. Si
        //el número no se encuentra en el array, la función devuelve el array {-1, -1}.

        public static int[] coordenadasEnArrayBiInt(Integer [][] matriz, Integer num){
            int [] coordenadas= new int[2];
            for (int i=0; i<matriz.length; i++){
                for (int j=0; j<matriz[i].length; j++){
                    if (Objects.equals(matriz[i][j], num)){
                        coordenadas[0]=i;
                        coordenadas[1]=j;
                       return coordenadas;
                    }
                    else {
                        coordenadas[0]=-1;
                        coordenadas[1]=-1;
                    }

                }
            }
            return coordenadas;
        }

} //fin clase

