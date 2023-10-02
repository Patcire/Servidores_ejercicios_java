package if_switch;

import java.util.Scanner;

public class if_switch_ej17 {
    public static void main(String arg[]) {
        // Escribe un programa que diga cuál es la última cifra de un número entero
        // introducido por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        var num = sc.nextInt();
        String numTxt = String.valueOf(num);
        numTxt = numTxt.strip();

        char[] charArray = numTxt.toCharArray();
        var lastNum = charArray[charArray.length - 1];

        System.out.println("El último dígito" + lastNum);
    }
}
