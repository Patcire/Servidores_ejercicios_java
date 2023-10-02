package if_switch;
import java.util.Scanner;
public class if_switch_ej07 {
    public static void main(String arg[]) {
        //Realiza un programa que calcule la media de tres notas. Sentencia condicional ( if y switch )
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la primera nota");
        var a= sc.nextDouble();
        System.out.println("Introduce la segunda nota");
        var b= sc.nextDouble();
        System.out.println("Introduce la tercera nota");
        var c= sc.nextDouble();

        var nota= (a+b+c)/3;
        System.out.println(String.format("%.2f",nota));

        if (nota<=10 && nota>=9.00){
            System.out.println("Sobresaliente:"+String.format("%.2f",nota));
        } else if (nota<=8.99 && nota>=7.00) {
            System.out.println("Notable:"+String.format("%.2f",nota));
        }else if (nota<=6.99 && nota>=6.00) {
            System.out.println("Bien:"+String.format("%.2f",nota));
        }else if (nota<=5.99 && nota>=5) {
            System.out.println("Suficiente:"+String.format("%.2f",nota));
        }else if (nota<=4.99 && nota>=0.00) {
            System.out.println("Insuficiente:"+String.format("%.2f",nota));
        }
    }
}
