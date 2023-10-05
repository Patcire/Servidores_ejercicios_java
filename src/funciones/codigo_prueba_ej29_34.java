package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class codigo_prueba_ej29_34 {
    public static void main(String[] args) {
        //PROBAMOS LA FUNCION generaArrayBiInt
        int[][] matriz = funciones_ej29_34.generaArrayBiInt(3, 3);
        System.out.println(Arrays.deepToString(matriz));

        //Probamos la función filaDeArrayBiInt
        int[] fila= funciones_ej29_34.filaDeArrayBiInt(matriz, 2);
        System.out.println(Arrays.toString(fila));

        //Probamos la función columnaDeArrayBiInt
        int[] columna=funciones_ej29_34.columnaDeArrayBiInt(matriz, 2);
        System.out.println(Arrays.toString(columna));

        //Probamos la función coordenadasEnArrayBiInt
        int[] coordenadas= funciones_ej29_34.coordenadasEnArrayBiInt(matriz, 5);
        System.out.println(Arrays.toString(coordenadas));


        // Probamos la función esPuntoDeSilla
        boolean es_punto=funciones_ej29_34.esPuntoDeSilla(matriz, 5);
        System.out.println(es_punto);


        //Probamos la funcion diagonal
        int[] diagonal= funciones_ej29_34.diagonal(matriz, "neso");
        System.out.println(Arrays.toString(diagonal));

    }


}
