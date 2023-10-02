package basicos;

import java.util.Scanner;

public class basico1_patricio {
    public static void main(String[] args) {

        /*
        Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y
        999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
        resta, la división y la multiplicación.
         */

        int x=144;
        int y=999;

        System.out.println("x= "+ x+ " , y= " + y);
        System.out.println("Suma= " + (x+y));
        System.out.println("Resta= " + (x-y));
        System.out.println("División= " + (y/x));
        System.out.println("Multiplicación= " + (x*y));
    }
}
