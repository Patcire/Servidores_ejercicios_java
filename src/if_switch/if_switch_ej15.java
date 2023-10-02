package if_switch;
import java.util.Scanner;
public class if_switch_ej15 {
    public static void main(String arg[]) {
    //Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que
        // podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa debe permitir
        //al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia
        //abajo, hacia la izquierda o hacia la derecha. Sentencia condicional (if y switch).
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un simbolo para la piramide");
        var c= sc.next();
        System.out.println("¿A dónde quieres que apunte el vértice?");
        System.out.println("Para que apunte hacia la izquierda introduzca 1");
        System.out.println("Para que apunte hacia la derecha introduzca 2");
        System.out.println("Para que apunte hacia arriba introduzca 3");
        System.out.println("Para que apunte hacia abajo introduzca 4");
        var num= sc.next();
        switch (num) {
            case "1":
                System.out.println(" "+" "+" "+c+c);
                System.out.println(" "+c+c+c+c);
                System.out.println(c+c+c+c+c);
                System.out.println(" "+c+c+c+c);
                System.out.println(" "+" "+" "+c+c);
                break;
            case "2":
                System.out.println(c+c+" "+" "+" ");
                System.out.println(c+c+c+c+" ");
                System.out.println(c+c+c+c+c);
                System.out.println(c+c+c+c+" ");
                System.out.println(c+c+" "+" "+" ");
                break;
            case "3":
                System.out.println(" "+" "+c+" "+" ");
                System.out.println(" "+c+c+c+" ");
                System.out.println(" "+c+c+c+" ");
                System.out.println(c+c+c+c+c);
                System.out.println(c+c+c+c+c);
                break;
            case "4":
                System.out.println(c+c+c+c+c);
                System.out.println(c+c+c+c+c);
                System.out.println(" "+c+c+c+" ");
                System.out.println(" "+c+c+c+" ");
                System.out.println(" "+" "+c+" "+" ");
                break;
        }





    }
}
