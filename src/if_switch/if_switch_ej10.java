package if_switch;

import java.util.Scanner;

public class if_switch_ej10 {
    public static void main(String[] args) {

        /*
        Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento
         */
        /*
        Acuario: del 20 de enero al 18 de febrero
        Piscis: del 19 de febrero al 20 de marzo
        Aries: del 21 de marzo al 19 de abril
        Tauro: del 20 de abril al 20 de mayo
        Géminis: del 21 de mayo al 20 de junio
        Cáncer: del 21 de junio al 22 de julio
        Leo: del 23 de julio al 22 de agosto
        Virgo: del 23 de agosto al 22 de septiembre
        Libra: del 23 de septiembre al 22 de octubre
        Escorpio: del 23 de octubre al 21 de noviembre
        Sagitario: del 22 de noviembre al 21 de diciembre
        Capricornio: del 22 de diciembre al 19 de enero
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuál es su mes de nacimiento?\n");
        String mes= leer.next().toUpperCase();
        System.out.println("¿Y el día?\n");
        int dia= leer.nextInt();

        if (dia<=0 || dia>31){ //este control es mínimo, no cubre todas las excepciones
            System.out.println("Día fuera de rango");
            System.exit(0);
        }
        String signo=""; //valor x defecto

        switch (mes) {
            case "ENERO" -> {
                if (dia < 19) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
            }
            case "FEBRERO" -> {
                if (dia < 18) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
            }
            case "MARZO" -> {
                if (dia < 20) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
            }
            case "ABRIL" -> {
                if (dia < 19) {
                    signo = "Aries";
                } else {
                    signo = "Tauro";
                }
            }
            case "MAYO" -> {
                if (dia < 20) {
                    signo = "Tauro";
                } else {
                    signo = "Géminis";
                }
            }
            case "JUNIO" -> {
                if (dia < 20) {
                    signo = "Géminis";
                } else {
                    signo = "Cáncer";
                }
            }
            case "JULIO" -> {
                if (dia < 21) {
                    signo = "Cáncer";
                } else {
                    signo = "Leo";
                }
            }
            case "AGOSTO" -> {
                if (dia < 23) {
                    signo = "Leo";
                } else {
                    signo = "Virgo";
                }
            }
            case "SEPTIEMBRE" -> {
                if (dia < 23) {
                    signo = "Virgo";
                } else {
                    signo = "Libra";
                }
            }
            case "OCTUBRE" -> {
                if (dia < 23) {
                    signo = "Libra";
                } else {
                    signo = "Escorpio";
                }
            }
            case "NOVIEMBRE" -> {
                if (dia < 22) {
                    signo = "Escorpio";
                } else {
                    signo = "Sagitario";
                }
            }
            case "DICIEMBRE" -> {
                if (dia < 22) {
                    signo = "Sagitario";
                } else {
                    signo = "Capricornio";
                }
            }
            default -> {
                System.out.println("mes incorrecto\n");
                System.exit(0);
            }
        } //termina el switch
        System.out.println("Su signo es " + signo);
    }
}
