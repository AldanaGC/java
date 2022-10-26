import java.util.*;

public class operadorTernario {
    public static void main(String[] args) {
        
        //declaracion de variable
        int num1 = 30;

        //Operador ternario
        String txt = (num1%2 == 0)? "El número es par" : "El número es impar";

        System.out.println(txt);
    }
}