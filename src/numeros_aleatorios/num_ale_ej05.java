package numeros_aleatorios;

public class num_ale_ej05 {
    public static void main(String[] args) {

        /*
        Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
        Muestra también el máximo, el mínimo y la media de esos números.
         */

        int max=0;
        int min=99999999;
        int almacen=0;
        for (int i=0; i<50; i++){
            int numero= Aleatorio.entero_aleatorio(100,199);
            System.out.print(numero+" ");
            if (numero>max){
                max=numero;
            }
            if (numero<min){
                min=numero;
            }
            almacen+=numero;
        }

        System.out.println("\t");
        System.out.println("El máx= "+ max);
        System.out.println("El min= "+ min);
        System.out.println("La media=  " + almacen/50);
    }
}
