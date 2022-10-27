package Clase2710;

public class main {
    public static void main(String[] args){

        //declaro variables
        String usuario, pass;

        //Instrucciones de entrada salida
        Imprimir.mensaje("Ingrese su nombre");
        usuario = Capturar.miTeclado("");
        Imprimir.mensaje("Ingrese su clave");
        pass = Capturar.miTeclado("");

        //Procesos y resultados. Utilizando la función anidada

        Funcion.verificar(usuario, pass);

    }
    
}
