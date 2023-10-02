package entrada_salida;

import java.util.Scanner;
public class entrada_ej08 {
    public static void main(String arg[]) {
    //Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu numero de horas trabajadas esta semana:");
        int horas= sc.nextInt();
        double salario= (horas*12)/7;
        System.out.println("Tu salario semanal es de:"+salario+" al día");
    }
}
