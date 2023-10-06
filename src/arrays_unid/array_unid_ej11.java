package java05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej11 {

    public static void main(String arg[]) {
        /*
         * Realiza un programa que pida 10 números por teclado y que los almacene en un
         * array.
         * A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
         * utilizando para ello una tabla.
         * Seguidamente el programa pasará los primos a las primeras posiciones,
         * desplazando el resto de
         * números (los que no son primos) de tal forma que no se pierda ninguno. Al
         * final se debe mostrar
         * el array resultante. Por ejemplo: Array inicial
         */
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        List<Integer> arrayPrimos = new ArrayList<Integer>();
        List<Integer> arrayNoPrimos = new ArrayList<Integer>();

        for (int i = 0; i < 9; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            var numero = sc.nextInt();
            num[i] = (int) numero;

        }

        // Crear un array con los no primos

        for (int i = 0; i < 9; i++) {
            var primo = true;
            // El 0, 1 y 4 no son primos
            if (num[i] == 0 || num[i] == 1 || num[i] == 4) {
                primo = false;
            }
            for (int x = 2; x < num[i] / 2; x++) {
                // Si es divisible por cualquiera de estos números, no
                // es primo
                if (num[i] % x == 0) {
                    primo = false;
                }
            }
            // Si no se pudo dividir por ninguno de los de arriba, sí es primo
            if (primo == true) {
                arrayPrimos.add(num[i]);
            }

        }
        // Crear un array con los no primos
        for (int i = 0; i < 9; i++) {

            // El 0, 1 y 4 no son primos
            if (num[i] == 0 || num[i] == 1 || num[i] == 4) {
                arrayNoPrimos.add(num[i]);
            }
            for (int x = 2; x < num[i] / 2; x++) {
                // Si es divisible por cualquiera de estos números, no
                // es primo
                if (num[i] % x == 0) {
                    arrayNoPrimos.add(num[i]);
                }

            }
        }
        arrayPrimos.addAll(arrayNoPrimos);
        System.out.println("Array ordenada");
        System.out.println(arrayPrimos);

    }
}