import java.util.*;

/**
 practico de clases objetos y metodos
 Objeto scanner, para ingresar teclado
 @author Aldana Gusmeroli
 */

 public class miPrimerTeclado { 
    public static void main(String[] args) {
        
        //declaro objeto
        Scanner miTeclado;

        //Inicializo mi primer teclado
        miTeclado = new Scanner(System.in);

        //declaro variables
        String nombre;

        //Instrucciones de entrada-salida
        System.out.println("Ingrese su nombre");

        //Inicializo variable nombre con el objeto y el metodo
        nombre = miTeclado.nextLine();

        System.out.println("Ingrese un numero: ");


        System.out.println("Hola " + nombre);
        System.out.println("El programa ha terminado");

    }
 }