package if_switch;
import java.util.Scanner;

public class if_switch_ej11 {
    public static void main(String arg[]) {
        //Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserta la hora");
        var hora= sc.nextInt();
        System.out.println("Inserta los minutos");
        var mins= sc.nextInt();

        var horaF=24-hora;
        var minsF=60-mins;

        System.out.println("Faltan "+horaF+" horas y "+minsF+" minutos para la media noche");


    }

}
