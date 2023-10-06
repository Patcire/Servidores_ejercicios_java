package java051;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class ej6 {
    public static void main(String[] args) {
        int[][] num = new int[6][10];
        int max = 0;
        int min = 1000;

        Random random = new Random();
        Set<Integer> numerosGenerados = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                int numeroGenerado;
                do {
                    numeroGenerado = random.nextInt(1001);
                } while (numerosGenerados.contains(numeroGenerado));
                
                numerosGenerados.add(numeroGenerado);
                num[i][j] = numeroGenerado;
            }
        }

        //Recorro la tabla
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