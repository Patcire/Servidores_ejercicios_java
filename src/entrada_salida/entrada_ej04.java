package entrada_salida;

import java.util.Scanner;
public class entrada_ej04 {
    // Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Suma:"+(num1+num2)+" Resta:"+(num1-num2)+" Multiplicación:"+(num1*num2)+" División:"+(num1/num2));
    }
}
