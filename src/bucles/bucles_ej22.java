package bucles;

public class bucles_ej22 {
    public static void main(String[] args) {
        /*
        Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
         */



        for (int numero_comprobar = 2; numero_comprobar <=100; numero_comprobar++){ //vueltas que da el bucle
            int contador=0;
            for (int divisor = numero_comprobar-1; divisor >=2; divisor--) { //numeros a dividir entre el numero a comprobar

                if (numero_comprobar % divisor == 0) {
                    contador++;
                }

            }
            if (contador==0 || numero_comprobar==100){
                System.out.println(numero_comprobar);
            }

        }

    }
}
