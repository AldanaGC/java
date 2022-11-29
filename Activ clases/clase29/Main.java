package clase29;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    //Declaro e instancio obj scanner
    Scanner teclado = new Scanner(System.in);

    //Instrucciones de salida
    System.out.println("Introduzca la base");
    double x = teclado.nextDouble();

    System.out.println("Introduzca la potencia");
    int y = teclado.nextInt();

    //Resultado
    double resultado = Math.pow(x, y);     
    
    //salida resultado
    System.out.println("El numero " + x + " elevado a " + y + " es igual a " + resultado);
    }
    
}
