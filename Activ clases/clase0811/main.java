package clase0811;
import java.util.Scanner;
/**
 * UTILIZAMOS MATH.POW
 * APLICAMOS CIERRE DE PROGRAMA CON system.exit(0);
 */

public class main {
    
    public static void main (String[] args){

        //declaracion e instanciacion del pbj scanner
        Scanner teclado = new Scanner(System.in);

        //Instrucciones de entrada salida
        System.out.println("Introduzca la base");
        double x = teclado.nextDouble();
        //salida voluntaria del software
        System.exit(0);

        System.out.println("Introduzca la potencia");
        int y = teclado.nextInt();

        //Resultado
        double resultado = Math.pow(x, y);

        //Resultado
        System.out.println("El numero " + x+ " elevado a " + y + " es igual a " + resultado);
    }

}
