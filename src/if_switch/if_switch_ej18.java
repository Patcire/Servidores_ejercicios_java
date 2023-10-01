package if_switch;

import java.util.Scanner;

class error_longitud extends Exception { //voy a crear una excepción para conrolar que no se pase de 5 dígitos

    public error_longitud(String error) {
        super(error);
    }
}
public class if_switch_ej18 {
    public static void main(String[] args) {
        /*
        Escribe un programa que diga cuál es la primera cifra de un número entero introducido por
        teclado. Se permiten números de hasta 5 cifras
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un número de hasta 5 cifras de máximo:\n");
        String numero=leer.next();

        try{
            if (numero.length()<=5) {
                char[] caracteres = numero.toCharArray();
                System.out.println("El primer dígito de su número es " + caracteres[0]);
            }
            else {
                throw new error_longitud("Máx 5 dígitos");
            }
        }
        catch (error_longitud e) {
            System.out.println("Error: " + e);

        }

    }
}
