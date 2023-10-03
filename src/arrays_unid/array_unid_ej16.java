package arrays_unid;

import numeros_aleatorios.Aleatorio;

import java.util.Arrays;
import java.util.Scanner;

public class array_unid_ej16 {
    public static void main(String[] args) {
        /*
        Escribe un programa que rellene un array de 20 elementos con números ente- ros aleatorios comprendidos
        entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario
        quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se
        volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
        Ejemplo: "'console
        159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223
        13
        ¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de
        7):
        1 159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140]
        249 [335] 326 223 13 '"
         */

        int[] numeros= new int[20];

        for (int i=0; i<numeros.length; i++ ){
            numeros[i]= Aleatorio.entero_aleatorio(0,400);
        }

        System.out.println(Arrays.toString(numeros));

        Scanner leer= new Scanner(System.in);
        System.out.println("¿Desea resaltar los múltiplos de 5 y de 7? Conteste con '5' o '7'\n");
        int respuesta=leer.nextInt();

        for (int elemento: numeros){
            if (elemento%respuesta==0){
                System.out.print("["+elemento+"]"+" ");
            }
            else {
                System.out.print(elemento+" ");
            }
        }
    }
}
