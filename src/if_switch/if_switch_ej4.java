package if_switch;

import java.util.Scanner;

public class if_switch_ej4 {
    public static void main(String[] args) {

        /*
        Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras.
        Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
        horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41,
        se pagan a 16 euros la hora.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca sus horas de trabajo de esta semana\n");
        int horas=leer.nextInt();
        int salario=1;

        if (horas<0){
            System.out.println("Error. Las horas no pueden ser negativas");
            System.exit(0);
        }
        else if (horas<=40){
            salario=horas*12;
        }
        else {
            salario=(40*12) + (horas-40)*16;

        }
        System.out.println("Su salario de esta semana es de "+ salario+ " euros");
    }
}
