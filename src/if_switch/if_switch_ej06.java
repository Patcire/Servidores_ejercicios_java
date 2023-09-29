package if_switch;

import java.util.Scanner;

public class if_switch_ej06 {
    public static void main(String[] args) {
        /*
        Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
        Aplica la fórmula t
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la altura en metros:\n");
        int altura=leer.nextInt();
        double gravedad=9.8;

        double tiempo= Math.sqrt((2*altura)/gravedad);

        System.out.println("El tiempo que tardará en caer ese objeto es de " + tiempo + " segundos");

    }
}
