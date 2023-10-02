package if_switch;

import java.util.Scanner;

public class if_switch_ej19 {
    public static void main(String arg[]) {
        // Realiza un programa que nos diga cuántos dígitos tiene un número entero que
        // puede ser positivo
        // o negativo. Se permiten números de hasta 5 dígitos.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero, máximo hasta 5 dígitos");
        var num = sc.nextInt();
        String numTxt = String.valueOf(num);

        if (num < 0 && numTxt.length() >= 6) {
            var resultado = numTxt.substring(1);
            System.out.println(resultado.length());
        } else if (numTxt.length() >= 6) {
            System.out.println("Límite de dígitos alcanzado");
        } else {
            System.out.println(numTxt.length());
        }

    }
}
