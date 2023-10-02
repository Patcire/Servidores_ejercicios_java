package bucles;

public class bucles_ej05 {
    public static void main(String[] args) {

        /*
        Ejercicio 5
        Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while .
         */

        int inicio=320;
        while (inicio>=160){
            System.out.println(inicio);
            inicio-=20;
        }

    }
}
