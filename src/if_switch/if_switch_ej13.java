package if_switch;
import java.util.Arrays;
import java.util.Scanner;
public class if_switch_ej13 {
    public static void main(String arg[]) {
       //Escribe un programa que ordene tres números enteros introducidos por teclado.
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        var a= sc.nextInt();
        System.out.println("Introduce el segundo numero");
        var b= sc.nextInt();
        System.out.println("Introduce el tercer numero");
        var c= sc.nextInt();

        int[] arrayNumero={a,b,c};

        Arrays.sort(arrayNumero);

        System.out.println(Arrays.toString(arrayNumero));

    }

}
