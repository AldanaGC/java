package Clase2710;

public class Funcion {

    static String saludar(String nombre){

        //Declaro e inicializo variable local
        String saludo = "Hola. Bienvenido" + nombre;
        return saludo;
    }

    static String error(String nombre){

        //Declaro variable local
        String error = "Ups! No pudimos validar tus datos " + nombre + ". Por favor intentalo nuevamente";
        return error;
    }



    //FUNCION ANIDADA
    static void verificar (String usuario, String pass){

        //Declaro variables locales
        String usuarioValido = "Codo";
        String passValido= "22923";

        //Validacion de datos mediante un if
        if(usuarioValido.equals(usuario)&&passValido.equals(pass)){
            //Llamamos a la funcion mensaje de la clase imprimir
            Imprimir.mensaje(saludar(usuario));
            return;
        }
            //Si los datos no son validos
            Imprimir.mensaje(error(usuario));
        


    }
    
}
