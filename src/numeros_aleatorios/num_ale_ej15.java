package numeros_aleatorios;

public class num_ale_ej15 {
    public static void main(String arg[]) {
        //Realiza un generador de melodía con las siguientes condiciones:
        // 1. Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
        // 2. Una melodía está formada por un número aleatorio de notas mayor o igual 
        // a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
        // 3. Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical “|” (Alt + 1). 
        //El final de la melodía se marca con dos barras.
        // 4. La última nota de la melodía debe coincidir con la primera
        var nota1=" ";
        int melodia=(int) ((Math.random()*7)+1)*4;
        String[] notas = {"do", "re", "mi", "fa", "sol", "la","si"};

        for (int i = 1; i <= melodia-1; i++) {
            int nota=(int) (Math.random()*7);
            System.out.print(notas[nota]+" ");
            if (i%4==0 && i!=1 ) {
                System.out.print("|");
            }
            if (i==1) {
                 nota1=notas[nota];
            }
        }
        System.out.print(nota1);
        System.out.print("||");
        
    

        }
 
}
