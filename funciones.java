import java.util.ArrayList;

/**
 * MiArrayList
 */
import java.util.ArrayList;

public class funciones {

    //zona de funciones, esta funcion imprime un mensaje
    static void imprimir(String mensaje){
        System.out.println(mensaje);
    }



    public static void main(String[] args) {
        
        //declaracion de array list
        ArrayList<String> autos;

        //instanciacion del AL
        autos = new ArrayList<String>();

        //metodo del AL
        //1-Insertar con el metodo .add()
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Fitito");
        autos.add("Escarabajo");


        //salida
        System.out.println("El AL autos es " + autos);

        //Obtener longitud del arraylist
        //autos.size();
        imprimir("Esta es una impresion de prueba de mi propia función");
        System.out.println("La longitud de autos es: " + autos.size());

        //4- Añadimos elemento en cualquier momento
        autos.add("Torino");

        System.out.println("El AL con el nuevo elemento es " + autos);

        //5- getters y setters get trae set modifica
        //autos.get(indice);
        System.out.println("El valor del elemento del indice 3 es: " +autos.get(3));

        //autos.set(indice que quiero sobreescribir,"lo que quiero cambair/valor")
        autos.set(1, "Taunus");
        System.out.println("El nuevo AL con el index 1 cambiado es: " + autos);

        //5- Obtener ultimo elemento de AL
        //autos.size-1

    }
}