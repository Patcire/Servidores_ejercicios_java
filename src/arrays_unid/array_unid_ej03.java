package java05;
import java.util.Scanner;
public class ej3 {
    
public static void main(String arg[]){
   /*  Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
    decir, el primero que se introduce es el último en mostrarse y viceversa.*/
    Scanner sc=new Scanner(System.in);
    int [] num=new int[9];

    for (int i = 0; i < 9; i++) {
        System.out.println("Introduce el numero "+(i+1));
        var numero=sc.nextInt();
        num[i]=(int) numero;
    }
    System.out.println("Array en orden contrario");
    for (int i = 8; i >=0; i--) {
        System.out.println(num[i]);
    }



    }
}