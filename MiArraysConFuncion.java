/**
 * arrays
 */
public class MiArraysConFuncion {

    //zona de funciones
    //Funcion que devuelve longitud del array
    static void size(int[] numero){
        System.out.println("La longitud del array es: " + numero.length);
    }

    public static void main(String[] args) {

        //declaracion array
        int [] numeros; //por convención el nombre del array sera en plural

        //instanciacion del array
        numeros = new int [3];

        //inicializacion del array
        numeros [0] = 156; //inidice 0 posicion/ objeto 1
        numeros [1] = 14; //indice 1 posicion 2
        numeros [2] = 9; //indice 2 posicion 3

        //Declaración inicializacion de un array en la misma linea
        int[] otroArrays = {25,43,89,64};

        //Longitud del array .lenght
        System.out.println("La longitud del Array otroArray es: " + otroArrays.length);

        //valor del index 0
        System.out.println("Index 0 vale" + otroArrays[0]);


        //Ultimo elemento sin saber la longitud de mi array
        System.out.println("El ultimo elemento vale " + otroArrays[otroArrays.length-1]);

        //arrays con for
        for(int i=0; i<otroArrays.length;i++){
            System.out.println(otroArrays[i]);
        }


        //sobreescritura
        otroArrays[3] =70;

        System.out.println("El nuevo valor del index 3 es: " + otroArrays[3]);


        //bucle for each
        for(int otroArray: otroArrays){
            System.out.println(otroArray);
        }

        size(numeros);


    }
}