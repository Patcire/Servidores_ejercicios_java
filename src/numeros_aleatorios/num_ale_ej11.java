package numeros_aleatorios;

public class num_ale_ej11 {
   public static void main(String arg[]) {
    //Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
    //forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, 
    // el número de suficientes, el número de bienes, etc.
    int contador=0;
    int sobresaliente=0;
    int notable=0;
    int bien=0;
    int suficiente=0;
    int suspensos=0;
    for (int i = 0; i < 20; i++) {
        int nota=(int) (Math.random()*10)+1;
        System.out.println(nota);
        if (nota<=10 && nota>=9){
            sobresaliente++;
            System.out.println("Sobresaliente");
        }else if(nota<=8 && nota>=7){
            notable++;
            System.out.println("Notable");
        }else if(nota<7 && nota>=6){
            bien++;
            System.out.println("Bien");
        }else if(nota<6 && nota>=5){
            suficiente++;
            System.out.println("Suficiente");
        } else {
            suspensos++;
            System.out.println("Suspenso");

        } 
    }
    System.out.println("\nNumero de sobresalientes: " + sobresaliente + "\nNumero de notables: "+ 
    notable+"\nNumero de bienes: "+bien+"\nNumero de suficientes: "+suficiente+"\nNumero de suspensos: "+suspensos);    
}
    
}
