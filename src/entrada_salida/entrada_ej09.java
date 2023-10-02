package entrada_salida;

import java.util.Scanner;

public class entrada_ej09 {
    public static void main(String[] args) {

        /*
        Ejercicio 9
        Escribe un programa que calcule el volumen de un cono según la fórmula
         */
        Scanner leer= new Scanner(System.in);
        System.out.println("Indique el radio del cono:\n");
        int radio=leer.nextInt();
        System.out.println("Y la altura:\n");
        int altura= leer.nextInt();

        double volumen=(Math.pow(radio, 2))*altura*(1.0/3)*Math.PI;

        System.out.println("El área de un rectángulo con "+radio+ " de base y "+ altura+ " de altura= "+volumen);

    }
}
