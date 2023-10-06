package java051;

import java.util.Random;

public class ej5 {
    public static void main(String arg[]) {
        /*
         * Realiza un programa que rellene un array de 6 filas por 10 columnas con
         * números enteros positivos comprendidos entre 0 y 1000
         * (ambos incluidos). A continuación, el programa deberá dar la posición tanto
         * del máximo como del mínimo
         */
        int[][] num = new int[6][10];
        int max = 0;
        int min = 1000;

        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = random.nextInt(1001);
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                
                if (num[i][j] > max) {
                    max = num[i][j];
                }
                if (num[i][j] < min) {
                    min = num[i][j];
                }

                
            }
        }
        
       //Enseño la tabla
       for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.print(num[i][j]+" ");
        }
    }

   
    //Muestro maximo y minimo
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 10; j++) {
            if (num[i][j] == max) {
                System.out.print("\nMáximo en fila " + i + ", columna " + j);
            } else if (num[i][j] == min) {
                System.out.print("\nMínimo en fila " + i + ", columna " + j);
            }
        }
    }
}
}
        