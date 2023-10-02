package bucles;

public class bucles_ej06 {
    public static void main(String[] args) {
        /*
        Ejercicio 6
        Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while
         */
        int inicio=320;
        do {
            System.out.println(inicio);
            inicio-=20;
        }
        while (inicio>=160);


    }
}
