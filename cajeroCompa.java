import java.util.*;

public class cajeroCompa {
    public static void main(String[] args) {
        
        Scanner miTeclado;
        miTeclado = new Scanner (System.in);
        
        String usuario, respuesta, password; 
      
        
   
        

        System.out.println("ingrese usuario:");
        usuario = miTeclado.nextLine();
        System.out.println("ingrese contraseña:");
        password = miTeclado.nextLine();

        

        if ((usuario.equals("kofla")) && (password.equals("123"))){
            System.out.println("Hola, " + usuario + ". A continuación seleccione una opción" );
            System.out.println("A - Datos del Usuario");
            System.out.println("B - Saldo");
            System.out.println("C - Transferencia");
            System.out.println("D - Pago Online");
            System.out.println("E - Salir");
            respuesta = miTeclado.nextLine();
                System.out.println("Opcion elegida "+respuesta);
        }else{
            System.out.println("Usuario o contraseña incorrecto");
        }
    }
}