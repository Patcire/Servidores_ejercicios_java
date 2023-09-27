package entrada_salida;

import java.util.Scanner;

public class entrada_ej7 {
    public static void main(String[] args) {

        /*
        Escribe un programa que calcule el total de una factura a partir de la base imponible.
         */


        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca su base ponible:\n");
        double base_ponible=leer.nextDouble();

        System.out.println("Con base ponible de "+ base_ponible+" la factura total asciende a "+(base_ponible+base_ponible*0.21)+" euros");
    }
}
