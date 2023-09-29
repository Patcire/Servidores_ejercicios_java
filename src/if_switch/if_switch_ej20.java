package if_switch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class if_switch_ej20 {
    public static void main(String[] args) {
        /*
        Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se
        permiten números de hasta 5 cifras. 37Sentencia condicional ( if y switch )
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo:\n");
        String numero=leer.next();

        try{
            if (numero.length()>=2 && numero.length()<=5) {
                //ArrayList<Character> caracteres =  new ArrayList<Character>(numero.);
                char[] caracteres= numero.toCharArray();

                char[] caracteres_inversos = new char[0];

                int contador=caracteres.length-1;
                for (int i=(caracteres.length); i>0; i--){
                    caracteres_inversos= Arrays.copyOf(caracteres_inversos, caracteres_inversos.length+1);
                    caracteres_inversos[caracteres_inversos.length-1]=caracteres[contador];
                    contador--;
                }


                if (Arrays.equals(caracteres, caracteres_inversos)){
                    System.out.println("Son capicuas");
                }
                else {
                    System.out.println("No lo son");
                }

                System.out.println(caracteres_inversos);

            }
            else {
                throw new error_longitud("Mín 2 dígitos, Máx 5 dígitos");
            }
        }
        catch (error_longitud e) {
            System.out.println("Error: " + e);

        }


    }
}
