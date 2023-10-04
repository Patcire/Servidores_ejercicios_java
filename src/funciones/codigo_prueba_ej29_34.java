package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class codigo_prueba_ej29_34 {
    public static void main(String[] args) {
        //PROBAMOS LA FUNCION generaArrayBiInt
        Integer[][] matriz = funciones_ej29_34.generaArrayBiInt(3, 3);
        System.out.println(Arrays.deepToString(matriz));

        //Probamos la función filaDeArrayBiInt
        Integer[] fila= funciones_ej29_34.filaDeArrayBiInt(matriz, 2);
        System.out.println(Arrays.toString(fila));

        //Probamos la función columnaDeArrayBiInt
        ArrayList<Integer> columna=funciones_ej29_34.columnaDeArrayBiInt(matriz, 2);
        System.out.println(columna);

        //Probamos la función coordenadasEnArrayBiInt
        int[] coordenadas= funciones_ej29_34.coordenadasEnArrayBiInt(matriz, 5);
        System.out.println(Arrays.toString(coordenadas));
    }
}
