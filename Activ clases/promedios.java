/**
 * promedios
 */
public class promedios {

    public static void main(String[] args) {
        //Declaracion instanciacion e inciializacion array
        int[] notas = {3, 8, 9, 3, 7, 3};
        int suma = 0;
        double promedio = 0;

        //for each
        for(int nota:notas){
            suma += nota; //suma = suma + nota;//

        }

        //proceso - promedio
        promedio = suma/notas.length;


        //salida
        System.out.println("El promedio  general es: " + promedio);
    }
}