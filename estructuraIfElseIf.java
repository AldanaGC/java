import java.util.*;



public class estructuraIfElseIf {
    public static void main(String[] args) {
        //declaro objeto teclado
        Scanner miTeclado;

        //inicializo teclado
        miTeclado = new Scanner(System.in);

        //Declaro variable e inicializo
        int nota;
        String alumno;

        //Inicializo variable
        System.out.println("Ingrese nombre del alumno");
        alumno = miTeclado.nextLine();

        System.out.println("Ingrese nota");
        nota = miTeclado.nextInt();

        //Estructura if-else-if
        if(nota == 10){
            System.out.println("La nota de " + alumno + " es " + nota + ", pertenece al cuadro de honor");

        } else if(nota >= 6 && nota < 10) {
            System.out.println("La nota de " + alumno + " es " + nota + ", es alumno/a regular");
        }else if(nota >= 1 && nota < 6) {
            System.out.println("La nota de " + alumno + " es " + nota + ", es alumno/a en proceso");
        }else if(nota == 0){
            System.out.println("La nota de " + alumno + " es " + nota + ", debe recursar");
        }else{
            System.out.println("Introduzca una nota válida");
        }

        //Instruccion de salida simple
        System.out.println("**EL PROGRAMA HA FINALIZADO**");

    }
}