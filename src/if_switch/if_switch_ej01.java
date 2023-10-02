package if_switch;
import java.util.Scanner;

public class if_switch_ej01 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un dia de la semana (en minusculas y sin acento)");
        var dia= sc.next();
        switch (dia) {
            case "lunes":
                System.out.println("El lunes a primera toca Despliegue Web entorno Servidor");
                break;
            case "martes":
                System.out.println("El martes a primera toca Empresa");
                break;
            case "miercoles":
                System.out.println("El miercoles a primera toca Despliegue Web entorno Cliente");
                break;
            case "jueves":
                System.out.println("El jueves a primera toca Despliegue Web entorno Cliente");
                break;
            case "viernes":
                System.out.println("El viernes a primera toca Despliegue Web entorno Servidor");
                break;
            case "sabado":
                System.out.println("El sabado no hay clase");
                break;
            case "domingo":
                System.out.println("El sabado no hay clase");
                break;

        }

    }
}
