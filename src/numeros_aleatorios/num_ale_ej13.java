package numeros_aleatorios;

public class num_ale_ej13 {
    public static void main(String arg[]) {
    //Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los
    // dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.
    int dado1;
    int dado2;
    int tiradas=0;
    
    do{
    dado1= (int) (Math.random()*6)+1;
    dado2= (int) (Math.random()*6)+1;
    System.out.println("dado 1: "+dado1);
    System.out.println("dado 2: "+dado2);
    tiradas++;
    } while( dado1!=dado2);
    System.out.println("Final");
    System.out.println("dado 1: "+dado1);
    System.out.println("dado 2: "+dado2);
    System.out.println("Tiradas necesarias: "+tiradas);
    


    }
    
}
