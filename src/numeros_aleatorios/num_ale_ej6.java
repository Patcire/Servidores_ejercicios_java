package numeros_aleatorios;

import java.util.Scanner;

public class num_ale_ej6 {
    public static void main(String[] args) {

        /*
        Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
        y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
        oportunidades quedan y si el número intro- ducido es menor o mayor que el número secreto.
         */


        int numero= Aleatorio.entero_aleatorio(0,100);
        Scanner leer = new Scanner(System.in);
        System.out.print(" Introduzca el número que está pensando:\n");
        int num_usuario=leer.nextInt();
        int oportunidades=4;
        while (true){
            if (oportunidades==0){
                System.out.println("Ha perdido");
                break;
            }
            if (numero>num_usuario){
                System.out.println("Su número es menor\n");
            }
            else if (numero==num_usuario){
                System.out.println("¡ACERTASTE!");
                break;
            }
            else {
                System.out.println("su númer es mayor");
            }



            System.out.println("Intento fallido le quedan "+ oportunidades+" oportunidades");
            num_usuario=leer.nextInt();
            oportunidades--;




        }


    }
}
