//importo biblioteca
import java.util.*;

/**
 @author Aldana Gusmeroli
 @version 1.0
 @date 28/09/22
 */



public class desafioUno {
    public static void main(String[] args) {
        
        //declaro objeto teclado
        Scanner miTeclado;

        //inicializo teclado
        miTeclado = new Scanner(System.in);

        //declaro variables
        int num1, num2, suma, resta, doble, triple;

        //Instruccion entrada/salida
        System.out.println("Ingrese número entero");
        num1 = miTeclado.nextInt();
        System.out.println("Ingrese otro número entero");
        num2 = miTeclado.nextInt();

        System.out.println("Los números ingresados son: " + num1 + " y " + num2 + ".");

        //inicializo variables en operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        doble = num1 * 2;
        triple = num1 * 3;

        /*P2 DESAFIO (Hacer una aplicación que permita ingresar 2 números y mostrar sus operaciones básicas.)*/

        //salida
        System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es de " + suma);
        System.out.println("El resultado de la resta de " + num1 + " y " + num2 + " es de " + resta);

        /*P3 DESAFIO (Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple*/
        //salida
        System.out.println("El resultado de la multiplicacion *2 del primer numero ingresado(" + num1 + ") es: " + doble);
        System.out.println("El resultado de la multiplicacion *3 del primer numero ingresado(" + num1 + ") es: " + triple);




    }
}
