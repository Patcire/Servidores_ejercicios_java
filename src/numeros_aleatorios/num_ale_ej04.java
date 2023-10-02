package numeros_aleatorios;

public class num_ale_ej04 {
    public static void main(String[] args) {

        /*
        Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
         */


        for (int i=0; i<20; i++){
            int numero= Aleatorio.entero_aleatorio(0,10); //reutilizo la función que ya creé
            System.out.print(numero+" ");
        }

    }
}
