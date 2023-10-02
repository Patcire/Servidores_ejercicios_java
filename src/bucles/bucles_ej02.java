package bucles;

public class bucles_ej02 {
    public static void main(String[] args) {

        /*
        Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
         */

        int i=1; //contador
        while ( i<=100){
            if (i%5==0){
                System.out.println(i);
            }
            i++;
        }

    }
}
