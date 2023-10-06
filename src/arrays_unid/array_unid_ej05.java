package java05;

import java.util.Scanner;

public class ej5 {
    
public static void main(String arg[]){
/*Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las palabras 
“máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.*/
Scanner sc=new Scanner(System.in);
    int [] num=new int[9];
    int max=0;
    int min=999999999;

    for (int i = 0; i < 9; i++) {
        System.out.println("Introduce el numero "+(i+1));
        var numero=sc.nextInt();
        num[i]=(int) numero;
        if (num[i]>max){
            max=num[i];
        }
        if (num[i]<min) {
            min= num[i];
        }
    }
    for (int i = 0; i < 9; i++) {
        
        if (num[i]==max) {
            System.out.println(max+" máximo");
            continue;
        }else if (num[i]==min){
            System.out.println(min+" mínimo");
            continue;
        }
        System.out.println(num[i]);

    }
    }
}