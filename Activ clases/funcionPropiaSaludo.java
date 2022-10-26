/**
 * funcionPropiaSaludo
 */
public class funcionPropiaSaludo {

    //zona de funciones
    static void imprimir(String mensaje ){
        System.out.println(mensaje);
    }

    //funcion saludo
    static void saludo (String nombre, int edad){
        System.out.println("Hola " + nombre + " tu edad es " + edad);
    }

    public static void main(String[] args) {
        //forma tradicional de imprimir mensaje
        System.out.println("Hola mundo");

        //imprimiendo mensaje con funcion propia
        imprimir("Hola mundo");

        saludo("Codo", 2022);
    }
}