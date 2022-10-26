import java.util.Scanner;

/**
 @author Aldana Gusmeroli
 @version 1.0 OPERADORES INCREMENTALES
 */

/*Inicio programa, trabajo con operadores incrementales*/
public class primerProgramaMejorado {
    public static void main(String[] args) {

        //declaro objeto
        Scanner miTeclado;

        //Inicializo teclado
        miTeclado = new Scanner(System.in);

        //declaro variable
        String nombre;
        int anho, anhoActual, edad, mes, mesNac;


        //inicializo variable
        System.out.println("Ingrese su nombre");
        nombre = miTeclado.nextLine();

        System.out.println("Ingrese año de nacimiento (xxxx)");
        anho = miTeclado.nextInt();

        System.out.println("Ingrese año actual(xxxx)");
        anhoActual = miTeclado.nextInt();

        System.out.println("Ingrese mes de nacimiento (Expresado en números)");
        mesNac = miTeclado.nextInt();

        System.out.println("Ingrese mes en curso(Expresado en números)");
        mes = miTeclado.nextInt();



        //inicializo variable operacional
        edad = anhoActual - anho;
        //datos de salida
        System.out.println("Hola, " + nombre + ". Usted nació en el año " + anho + ".Estamos cursando el año " + anhoActual );
        
        if(mes < mesNac){
            System.out.println( "Usted tiene: " + --edad +  ". En el mes de " + mesNac + " tendrá " + ++edad +  " años.");
        }else{
            System.out.println("Usted tiene " + edad + " años.");
        }
        

        //System.out.println("Si aún no es 9 de octubre -fecha de su cumpleaños- " + nombre + " tiene: " + --edad + " años.");
        //System.out.println("La edad de "+ nombre + " pasando octubre es: " + ++edad + " años.");
        //System.out.println("En el año 2023, " + nombre + " tendrá " + ++edad + " años.");
        
    }
}