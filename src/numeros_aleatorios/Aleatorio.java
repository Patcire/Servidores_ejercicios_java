package numeros_aleatorios;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio { //clase con las funciones que he creado para estos ejercicios
    public static int entero_aleatorio(int suelo, int techo) { //Se le pasa suelo, que es el mínimo y techo el máx del rango del que queremos sacar el nº

        Random num_random = new Random();
        //con esta formula me aseguro que no salga un 0, porque el rango de .random empieza en 0
        return (int) Math.floor(Math.random() * (techo - suelo + 1) + suelo);
    }
}
