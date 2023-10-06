package java05;

import java.util.Scanner;

public class ej13 {

    public static void main(String arg[]) {
        /*
         * Escribe un programa que rellene un array de 100 elementos con números ente-
         * ros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
         * A continuación el programa mostrará el array y preguntará si el usuario
         * quiere destacar el máximo o el mínimo.
         * Seguidamente se volverá a mostrar *el array escribiendo el número destacado
         * entre dobles asteriscos.
         */
        Scanner sc = new Scanner(System.in);

        int max = 0;

        int min = 501;

        int[] numRandom = new int[99];

        for (int i = 0; i < numRandom.length; i++) {
            numRandom[i] = (int) Math.round((Math.random() * 500));
            if (numRandom[i] > max) {
                max = numRandom[i];
            }
            if (numRandom[i] < min) {
                min = numRandom[i];
            }
        }
        System.out.println("¿Qué quiere destacar? (2 - máximo, 1 - mínimo)");
        for (int numeros : numRandom) {
            System.out.print(numeros + " ");
        }
        int num = sc.nextInt();

        if (num == 2) {
            for (int i = 0; i < 99; i++) {

                if (numRandom[i] == max) {
                    System.out.print(" **"+ max +"** ");
                    continue;
                }
                System.out.print(numRandom[i]+" ");
            }
        } else if (num == 1) {
            for (int i = 0; i < 99; i++) {

                if (numRandom[i] == min) {
                    System.out.print(" **"+ min +"** ");
                    continue;
                }
                System.out.print(numRandom[i]+" ");
            }
        }
        }
    }
