/**
 * parseo
 */
public class parseo {

    public static void main(String[] args) {
        //declaro e inicializo variable
        String numString = "453";
        int numInt;

        numInt = Integer.parseInt(numString);

        //salida
        System.out.println("numString= " + (numString + 24));
        System.out.println("numInt= " + (numInt + 24));
    }
}