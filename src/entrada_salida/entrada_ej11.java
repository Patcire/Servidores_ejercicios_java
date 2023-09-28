package entrada_salida;

import java.util.Scanner;

public class entrada_ej11 {
    public static void main(String[] args) {

        /*
        Realiza un conversor de Kb a Mb.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca los Kbs deseados:\n");
        float kb = leer.nextFloat();
        System.out.println("Eso son "+ (kb/ 1024) + " megas");
    }
}
