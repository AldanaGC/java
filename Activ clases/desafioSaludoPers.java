//importo biblioteca
import java.util.*;

/**
 @author Aldana Gusmeroli
 @version 2.0
 */

public class desafioSaludoPers {
    public static void main(String[] args) {
        //declaro objeto teclado
        Scanner miTeclado;

        //inicializo objeto
        miTeclado = new Scanner(System.in);

        //declaro variables
        String nombre;
        int num1, num2, num3, resultado;

        //Inicio instruccion entrada
        System.out.println("Ingrese su nombre");
        nombre = miTeclado.nextLine();
        System.out.println("A continuación, deberá ingresar 3 números enteros.");
        System.out.println("Ingrese un numero");
        num1 = miTeclado.nextInt();
        System.out.println("Ingrese un numero");
        num2 = miTeclado.nextInt();
        System.out.println("Ingrese un numero");
        num3 = miTeclado.nextInt();

        //inicializo variables operacion
        resultado = num1 + num2 + num3;

        //salida
        System.out.println("Hola, " + nombre + ". Los números ingresados son: " + num1 + ", " + num2 + ", " + num3 + ". La suma total de los mismos es: " + resultado + "." );


    }
}
