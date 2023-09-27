package if_switch;


import java.util.Scanner;
import java.util.ArrayList;
public class if_switch_ej8 {
    public static void main(String[] args) {

        /*
       Ejercicio 7
        Realiza un programa que calcule la media de tres notas. 35Sentencia condicional ( if y switch )
        Ejercicio 8
        Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable
        o sobresaliente).

         */
        int suma=0;
        for (int i=0; i<3; i++){
            Scanner leer = new Scanner(System.in);
            System.out.println("Introduzca una nota entera:\n");
            int nota= leer.nextInt();
            suma=suma+nota;
        }

        int media=suma/3;
        System.out.println("La media de esos 3 números es: "+ (media));
        switch (media){ //con switch no se puede usar double ni float, tampoco condiciones. Así que es + largo
            case (5):
                System.out.println("suficiente");
                break;
            case (6):
                System.out.println("sufi");
                break;
            case (7):
                System.out.println("notable");
                break;
            case (8):
                System.out.println("sobre");
            case (9):
                System.out.println("sobre");
                break;

        }
    }
}
