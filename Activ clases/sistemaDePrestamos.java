import java.util.*;

/*
* Programar un sistema de créditos que pida el nombre del usuario y su ingreso medio,
* A partir de los datos ingresados  el programa arrojará el máximo crédito disponible.
* Las lineas de crédito son
* Ingresos inferiores a $ 50000 son clase A
* Ingresos entre $50000 y 100000 son clase B
* Ingresos mayores a 100000 son clase C
*
* En todos los casos el valor de la cuota no debe superar 1/3 del ingreso
* Hasta en 24 cuotas
*
*
* */

public class sistemaDePrestamos {
    public static void main(String[] args) {
        
        //declaro objeto teclado
        Scanner miTeclado;

        //inicializo teclado
        miTeclado = new Scanner(System.in);

        //declaro variables
        String nombre;
        Double ingresoMedio;
        char clas = 'A';

        //Instrucciones de entrada-salida

        System.out.println("Por favor, ingrese su nombre");
        nombre = miTeclado.nextLine();

        System.out.println("Ingrese su ingreso medio");
        ingresoMedio = miTeclado.nextDouble();

        //estructura if-else
        if(ingresoMedio > 0 && ingresoMedio <= 50000){
            clas = 'A';
        }else if(ingresoMedio > 50000 && ingresoMedio <= 100000){
            clas = 'B';
        }else if(ingresoMedio > 100000){
            clas = 'C';
        }else if(ingresoMedio <= 0){
            System.out.println("Usted no puede solicitar prestamos");
            clas = 'D';
        }else {
            System.out.println("Ocurrió un error, intentelo nuevamente");
        }

        //Procesos
        double valorCuota = ingresoMedio/3;
        double valorPrestamo = valorCuota*24;

        //Estructura switch
        switch (clas) {
            case 'A':
            System.out.println("Hola, " + nombre);
            System.out.println("Sus ingresos son clasiificados como tipo: " + clas);
            System.out.println("Usted puede pedir un prestamo de hasta: $" + valorPrestamo);
            System.out.println("A devolverlos en 24 cuotas de: $" + valorCuota);
                break;
            case 'B':
            System.out.println("Hola, " + nombre);
            System.out.println("Sus ingresos son clasiificados como tipo: " + clas);
            System.out.println("Usted puede pedir un prestamo de hasta: $" + valorPrestamo);
            System.out.println("A devolverlos en 24 cuotas de: $" + valorCuota);
            break;
            case 'C':
            System.out.println("Hola, " + nombre);
            System.out.println("Sus ingresos son clasiificados como tipo: " + clas);
            System.out.println("Usted puede pedir un prestamo de hasta: $" + valorPrestamo);
            System.out.println("A devolverlos en 24 cuotas de: $" + valorCuota);
            break;
            default:
            System.out.println("Opción no válida, por favor contáctenos por ayuda.");
                break;
        }

    }
}