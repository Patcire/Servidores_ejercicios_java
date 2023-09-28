package entrada_salida;

import java.util.Scanner;

public class entrada_ej3 {
    public static void main(String[] args) {

        /*
        Patricio
        Enunciado: Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser
        introducida por teclado
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca las cantidad de pesetas deseada:\n");
        float pesetas=leer.nextFloat();
        System.out.println(pesetas/166+" euros");
    }
}
