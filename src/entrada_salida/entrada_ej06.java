package entrada_salida;

import java.util.Scanner;
public class entrada_ej06 {
    //Escribe un programa que calcule el área de un triángulo.
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la longitud de la base en cm");
        double base = sc.nextDouble();
        System.out.println("Longitud de la altura en cm");
        double altura = sc.nextDouble();
        double area = (base*altura)/2;
        System.out.println("El área de tu triángulo es de:"+String.format("%.2f", area)+"cm2");


    }
}
