package entrada_salida;

import java.util.Scanner;

public class entrada_ej05 {
    public static void main(String[] args) {

        /*
        Patricio
        Ejercicio 5
        Escribe un programa que calcule el área de un rectángulo
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el base del rectángulo:\n");
        int base=leer.nextInt();
        System.out.println("Y la altura:\n");
        int altura= leer.nextInt();

        System.out.println("El área de un rectángulo con "+base+ " de base y "+ altura+ " de altura= "+(base*altura));
    }
}
