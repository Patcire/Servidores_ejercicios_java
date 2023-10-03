package arrays_unid;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class array_unid_ej14 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
        correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación.
        Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa
        deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
        blanco y morado
         */

        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro",
                "blanco", "morado"};
        ArrayList<String> palabras = new ArrayList<>();

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Introduzca una palabra:\n");
            String respuesta = leer.next().toLowerCase();
            palabras.add(respuesta);
        }

        ArrayList<String> colores_usuario = new ArrayList<>();

        //copio la lista original
        ArrayList<String> resto_palabras_usuario = new ArrayList<>(palabras);

        for (String palabra : palabras) {
            for (String color : colores) {
                if (Objects.equals(palabra, color)) {
                    //añado el color a esa lista
                    colores_usuario.add(palabra);
                    //elimino el color de esta otra
                    resto_palabras_usuario.remove(palabra);
                    break;
                }
            }
        }

        ArrayList<String> array_final = new ArrayList<>(colores_usuario);
        array_final.addAll(resto_palabras_usuario);
        System.out.println(array_final);

    }
}
