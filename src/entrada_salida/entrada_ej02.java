package entrada_salida;

import java.util.Scanner;
public class entrada_ej02 {
    //Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser
    //introducida por teclado.
    //Realiza un conversor de pesetas a euros.
    public static void main(String arg[]) {
        var pesetas=0.0;
        var euros=0.0;
        Scanner entrada=new Scanner(System.in);
        euros=entrada.nextDouble();
        pesetas=Math.round(euros*166.386);
        System.out.println(euros+" euros son "+String.format("%.2f", pesetas)+" pesetas");
    }
}
