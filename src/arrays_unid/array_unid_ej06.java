package arrays_unid;

import java.util.ArrayList;
import java.util.Scanner;

public class array_unid_ej06 {
    public static void main(String[] args) {

        /*
        Ejercicio 6
        Escribe un programa que lea X números por teclado y que los almacene en un array. Rota los
        elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a
        la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente,
        muestra el contenido del array
         */
        ArrayList<Integer> lista_num= new ArrayList<Integer>();
        int tamanio_lista=5;
        for (int i=tamanio_lista;i>0;i--){
            Scanner leer = new Scanner(System.in);
            System.out.println("Escriba un nº");
            int num_usuario=leer.nextInt();
            lista_num.add(num_usuario);
            System.out.println("Le quedan "+(i-1)+" nº por introducir\"");
        }

        System.out.println(lista_num.toString());

        int ultimo_num= lista_num.get(tamanio_lista-1);
        for (int i=tamanio_lista-1;i>0;i--){ //lo hago en otro bucle for porque así lo indica el enunciado,

                int numero = lista_num.get(i-1); // el elemento anterior
                lista_num.set(i, numero);
            }
            //si i=4
            lista_num.set(0,ultimo_num);

        System.out.println(lista_num.toString());
    }
}
