package bucles;

import java.util.Scanner;

public class bucles_ej07 {
    public static void main(String[] args) {
        /*
        Ejercicio 7
        Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El
        programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
        “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto
        satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.

         */

        int contrasenia=3654;
        Scanner leer = new Scanner(System.in);
        for (int i=4; i>0; i--){
            System.out.println("Escriba la contraseña: \n");
            int intento=leer.nextInt();
            if (intento==contrasenia){
                System.out.println("La caja fuerte se ha abierto " +
                        "satisfactoriamente");
                break;
            }
            System.out.println("Lo siento, esa no es la combinación, le quedan "+ (i-1)+ " intentos");
            if (i==1){
                System.out.println("Cuenta bloqueada");
            }
        }

    }
}
