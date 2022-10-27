package Clase2710;

import java.util.Scanner;

public class Capturar{

    static String miTeclado (String variable){
        //Declaro el objeto
        Scanner miTeclado = new Scanner(System.in);

        //Preparación de la inicialización
        variable = miTeclado.nextLine();

        //valor del retorno
        return variable;
    }

}
