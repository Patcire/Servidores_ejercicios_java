package entrada_salida;

import java.util.ArrayList;
import java.util.Scanner;

public class entrada_ej1 {
    public static void main(String[] args) {

        // Patricio
        /*
        Enunciado:
        Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.
         */

        Scanner leer = new Scanner(System.in);
        ArrayList<String> palabras_a_cambiar= new ArrayList<String>();
        palabras_a_cambiar.add("uno");
        palabras_a_cambiar.add("otro");

       ArrayList<Integer> numeros_usuario= new ArrayList<Integer>();


        for (int i=0; i<2; i++){
            System.out.println("Escriba "+ palabras_a_cambiar.get(i) + " número entero:\n");

            numeros_usuario.add(i, leer.nextInt());
        }

        System.out.println("El producto de "+ numeros_usuario.get(0)+" y " + numeros_usuario.get(1) + " es igual" +
                " a "+ (numeros_usuario.get(0)*numeros_usuario.get(1)));



    }
}
