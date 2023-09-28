package if_switch;

import java.util.Scanner;

public class if_switch_ej14 {
    public static void main(String[] args) {
        /*
        Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un nº entero:\n");
        int numero= leer.nextInt();
        if (numero%2==0){
            System.out.println("Es par\n");
            if (numero%5==0){
                System.out.println(" y divisible entre 5");
            }
        }

        else if (numero%5==0) {
            System.out.println("Es impar y divisible entre 5");
        }
        else {
            System.out.println("Es impar pero no es divisible entre 5");
        }
    }
}
