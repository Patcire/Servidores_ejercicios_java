package arrays_bidir;

import numeros_aleatorios.Aleatorio;

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
        System.out.println("Matriz normal");
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


            int numero_filas = numeros.length;

            for (int capa = 0; capa < numero_filas / 2; capa++) {
                int primero = capa;
                int ultimo = numero_filas - 1 - capa;

                for (int i = primero; i < ultimo; i++) {
                    int elemento_inicial = numeros[primero][i];
                    // movemos el elemento de la parte superior a la izquierda
                    numeros[primero][i] = numeros[ultimo - (i - primero)][primero];
                    // elemento de la parte izquierda a la parte superior
                    numeros[ultimo - (i - primero)][primero] = numeros[ultimo][ultimo - (i - primero)];
                    // el elemento de la parte inferior a la izquierda
                    numeros[ultimo][ultimo - (i - primero)] = numeros[i][ultimo];
                    // ponemos al ultimo el valor inicial
                    numeros[i][ultimo] = elemento_inicial;
                }
            }

        System.out.println();
        System.out.println("Matriz rotada:");
        for (int fila = 0; fila <numeros.length; fila++){
            for (int colum=0; colum<numeros[fila].length; colum++){
                System.out.print(numeros[fila][colum]+" ");
            }
            System.out.println();
        }

    }
}
