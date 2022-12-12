package clase30;

public class MetodoRandom {
    public static void main(String[] args) {
        
        //Metodo Random
       // System.out.println(Math.random());

        //Metodo random con un numero entero
       // System.out.println(Math.random()*18);

        //Utilizar for para obtener 10 numeros aleatorios
       // for (int i=0; i<10;i++){
         //   System.out.println(Math.random()*21);
        //}

        //Generar numeros entre el 15 y el 31
        /*for (int i=0; i<10;i++){
            System.out.println(Math.random()*(31-15)+ 15);
        }*/
        //casteo, llevar todo a int

        for (int i=0; i<10;i++){
            int numRandom =(int)Math.floor(Math.random()*(31-15)+ 15);
            System.out.println(numRandom);
        }



    }
    
}
