package bucles;

import java.util.Scanner;

public class bucles_ej18 {
    public static void main(String[] args) {
        /*
        Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos
        por teclado y validados como distintos, el programa debe empezar por el menor de los
        enteros introducidos e ir incrementando de 7 en 7.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un nº:\n");
        int numero1=leer.nextInt();
        System.out.println("Introduzca otro:\n");
        int numero2=leer.nextInt();
        while (numero1==numero2){
            System.out.println("Error, no pueden ser el mismo nº. Introduzca otro\n:");
            numero2= leer.nextInt();
        }

        if (numero1<numero2){ //la variable num1 siempre va a contener el mayor de los dos nº
            int almacen=numero1;
            numero1=numero2;
            numero2=almacen;
        }

        while (numero1>numero2){
            System.out.println(numero2);
            numero2+=7;
        }

    }
}
