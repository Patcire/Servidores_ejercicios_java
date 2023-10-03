package arrays_unid;

import java.util.Scanner;
import numeros_aleatorios.Aleatorio; // importo la función que creé en esa clase/paquete

public class array_unid_ej04 {
    public static void main(String[] args) {
        /*
        Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga
        el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
        cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar los
        cubos de los valores que hay en numero. A continuación, muestra el contenido de los tres arrays
        dispuesto en tres columnas.
         */

        int[] numeros= new int[20];
        int[] cuadrados= new int[20];
        int[] cubos= new int[20];

        for (int i=0; i<numeros.length; i++ ){
            numeros[i]=Aleatorio.entero_aleatorio(0,100);
            cuadrados[i]= (int) Math.pow(numeros[i], 2);
            cubos[i]= (int) Math.pow(numeros[i], 3);
            System.out.println(numeros[i]+"    "+cuadrados[i]+"     "+cubos[i]);
        }

    }
}
