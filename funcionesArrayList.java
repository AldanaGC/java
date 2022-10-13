import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * funcionesArrayList
 */
public class funcionesArrayList {

    public static void main(String[] args) {
        
        //1- Declaracion e instalacion 
        ArrayList<String> frutas;


        //2- Instalacion
        frutas = new ArrayList<String>();

        //3 - Inicializacion
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("sandia");
        frutas.add("manzana");

        /* ***Metodos del arraylist *** */

        //1- Imprimir nuestro AL
        System.out.println("Mi AL es " + frutas);

        //2- Metodo para obtener un dato .get()
        System.out.println("El dato del index 1 es " + frutas.get(1));

        //3-Metodo para cambiar un valor .set() es un procedimiento, no trae memoria, ni dato.
        frutas.set(2,"mandarina");

        System.out.println(frutas);

        //4- Metodo que no necesita parametros pero devuelve algo .size()
        System.out.println("La longitud de mi AL es " + frutas.size());

        //5-Metodo como tal a través de la llamada de un objeto
        //Collections.sort()
        Collections.sort(frutas);
        System.out.println("El AL ordenado  alfabeticamente es " + frutas);

        System.out.println(frutas.get(1));

    }
}