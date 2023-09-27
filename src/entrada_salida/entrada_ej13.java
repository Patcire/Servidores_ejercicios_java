package entrada_salida;

import java.util.Scanner;

public class entrada_ej13 {
    public static void main(String[] args) {
        /*
        Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
        Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer
        examen cuenta el 40% y la del segundo examen un 60%
        Ejemplo 1:
        Introduce la nota del primer examen: 7
        ¿Qué nota quieres sacar en el trimestre? 8.5
        Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
         */

        Scanner leer= new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen (con decimales)7\n");
        double primera_nota=leer.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre (con decimales)?\n");
        double nota_final=leer.nextDouble();
        double segunda_nota=(nota_final-(primera_nota*0.4))/0.6;
        System.out.println("Para tener un "+nota_final+" es necesario que saques un "+segunda_nota+" en el segundo examen");
    }
}
