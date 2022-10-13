public class bucleDoWhile {
    public static void main(String[] args) {
        //declaro variables
        int n = 5;
        int f = 1; //acumulador
        int i = 1 ; //contador

        do{
            f=f*i; //acumulacion
            i++; //actualizacion de contador
        } while(i<=n);

        System.out.println("El factorial de " + n + " es " + f);
        System.out.println("**El programa ha finalizado**");

    }

}
