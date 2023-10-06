package java051;

import java.util.ArrayList;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        int filas = 8;
        int columnas = 8;
        String letra = "";
        String num = "";
        String letras = "abcdefgh";

        ArrayList<String> posiciones = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la posición del alfil (por ejemplo, a1):");
        String posicion = sc.nextLine();

        letra = posicion.substring(0, 1);
        num = posicion.substring(1);

        System.out.println("Posición: " + letra + num);

        int columna = letras.indexOf(letra);
        int fila = Integer.parseInt(num);

        // Arriba izquierda
        while (columna > 0 && fila < 8) {
            columna--;
            fila++;
            posiciones.add(letras.charAt(columna) + String.valueOf(fila));
        }

        // Arriba derecha
        columna = letras.indexOf(letra);
        fila = Integer.parseInt(num);
        while (columna < 7 && fila < 8) {
            columna++;
            fila++;
            posiciones.add(letras.charAt(columna) + String.valueOf(fila));
        }

        // Abajo izquierda
        columna = letras.indexOf(letra);
        fila = Integer.parseInt(num);
        while (columna > 0 && fila > 1) {
            columna--;
            fila--;
            posiciones.add(letras.charAt(columna) + String.valueOf(fila));
        }

        // Abajo derecha
        columna = letras.indexOf(letra);
        fila = Integer.parseInt(num);
        while (columna < 7 && fila > 1) {
            columna++;
            fila--;
            posiciones.add(letras.charAt(columna) + String.valueOf(fila));
        }

        System.out.println("El alfil puede saltar a las siguientes casillas:");
        for (String pos : posiciones) {
            System.out.println(pos);
        }
    }
}