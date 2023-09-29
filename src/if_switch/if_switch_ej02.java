package if_switch;

import java.util.Scanner;

public class if_switch_ej02 {
    public static void main(String[] args) {

        /*
        Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
        tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a
        5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por
        teclado.

         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la hora en el rango 00-23 (sin los minutos)");
        int hora=leer.nextInt();
        String tipo_saludo;
        if (hora>=6 && hora<12){
            tipo_saludo="Buenos días";
        }
        else if (hora>=13 && hora<20){
            tipo_saludo="Buenas tardes";
        }
        else{
            tipo_saludo="Buenas noches";
        }

        System.out.println(tipo_saludo);
    }
}
