package numeros_aleatorios;

public class num_ale_ej01 {
    public static void main(String[] args) {

        /*
        Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total
        (los puntos que suman entre los tres dados)
         */


        System.out.println("Vamos a tirar 3 dados:\n");
        int suma=0;
        for (int i=0; i<3; i++){
            int num_dado= Aleatorio.entero_aleatorio(1,6); //utilizo la función que he creado (ver archivo Aleatorio en este mismo paquete)
            System.out.println("Tirada "+(i+1)+ ". Ha salido un: " + num_dado );
            suma+=num_dado;
        }
        System.out.println(" La suma de los tres es " + suma);
    }
}
