/**
 * bucleFor
 */
public class bucleFor {

    public static void main(String[] args) {
        
        //declaracion de variables
        int n = 5;//numero a aplicar factorial
        int f = 1; //acumulador

        //Bucle for
        for(int i = 1; i <= n; i++){
            f = f*i;
    
        }
        System.out.println("El factorial de " + n + " es " + f);
        System.out.println("**El programa ha finalizado**");
    }
}