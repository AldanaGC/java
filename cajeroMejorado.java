//importacion libreria
import java.util.*;

/**
 * Porgramar solo con estructuras de control switch y estructuras if anidados, un menú home-banking.
 * Que pida un usuario sin limite de ingresos (por ahora).
 * Que pida una clave.
 * Que el menú muestre un saldo ficticio, una opción transferencia y una opción pago online.
 * El menu de saldo nos mostrará el saldo ficticio y nos dará la opción de cerrar sesion para salir, no se puede regresar al menu por ahora. Nota: utilizar solo if anidado y switch en todo el practico. NO UTILIZAR BUCLES
 * La operación de transferencia será a una cuenta ficticia, que lo importante en este punto es sea que tras la operación el descuento se vea reflejado en el saldo en la misma seccion, esta seccion tambien contendra la opcion cerrar sesion, por el momento no se puede volver al menu. NO UTILIZAR BUCLES AUN
 * La seccion de pago de algun servicio, que luego del pago el descuento tambien se vea reflejado en el saldo y permita pagar servicios, cuando el saldo sea insuficiente la operación no podra realizarse y mostrará la leyenda "Saldo insuficiente", esta seccion tambien tendra una opcion cerrar sesion, por el momento tampoco se podra regresar alm menu. NO UTILIZAR BUCLES
 * Por ultimo tras el cierre de sesion en todos los casos arrojará la leyenda por favor extraiga su tarjeta.
 * 
 * 
 * @author Aldana Gusmeroli
 * @version 3.0
 */

public class cajeroMejorado{
    public static void main(String[] args) {
        //declaro objeto
        Scanner miTeclado;

        //inicializo teclado
        miTeclado = new Scanner(System.in);

        //delcaro e inicializo variables
        //LETRAS
        String usuario, usuarioGuardado, claveGuardada, clave, sesionContinuar, sesion;
        //NUMEROS
        int intentos, maximo, cbu, menu, respuesta, rtaSaved;
        //DECIMALES
        double monto, saldo, totalPagos;

        //variables ingresos por teclado opciones
        menu = 0; //para ir al menu de opciones
        sesion = "";//para continuar al menu principal
        sesionContinuar = "S";
        respuesta=0;
        rtaSaved=1;
        
        //variables registro
        usuario="";
        clave = "";
        usuarioGuardado = "aldana";
        claveGuardada = "1234";
        maximo = 3;
        intentos = 1;

        //variables datos cbu, saldos, pagos
        cbu = 0;//ingreso de nuevo cbu
        monto = 0;
        saldo= 43500.77;
        //declaro e inicializo variables de pagos
        int cable = 10000;
        int inmbobiliario = 4998;
        int automotor = 12350;
        //operacion para PAGOS preestablecidos
        totalPagos = (cable + inmbobiliario + automotor);


        //Instrucciones e-s
        //ingreso manual Usuario y clave
        while( !( (usuario .equals(usuarioGuardado))&&(clave .equals(claveGuardada))) && (intentos<=maximo) ){
            System.out.println("Ingrese su nombre de usuario");
            usuario = miTeclado.nextLine();
            System.out.println("Ingrese su clave alfanumerica");
            clave = miTeclado.nextLine();
            if (intentos==3){
                System.out.println("Usuario bloqueado");
            }
            intentos++;
        }

        //if-else
        //Saludo de bienvenida, opcion de cerrar sesion/continuar a menu
        if(usuario .equals(usuarioGuardado) && clave .equals(claveGuardada)){
                System.out.println("Hola, " + usuario + ". Bienvenido/a al sistema de Home Banking");
                System.out.println("Su saldo actual es de $" + saldo);
                System.out.println("¿Desea continuar operando? Marque S para continuar al Menu de opciones / N para cerrar sesion)");
                sesion = miTeclado.nextLine();
            }if(sesion .equals(sesionContinuar)){
                System.out.println("Cargando menú de opciones");
                do{
                do{
                    System.out.println("Menú de opciones");
                    System.out.println("1: Datos de cuenta / Saldos.");
                    System.out.println("2: Realizar transferencia.");
                    System.out.println("3: Realizar un pago.");
                    System.out.println("4: Cerrar sesión.");
                    menu = miTeclado.nextInt();
                    System.out.println("Ha seleccionado la opcion: " + menu);
                    }while(menu<1 || menu>4);

            //estructura switch
                    switch (menu) {
                        case 1://CUENTA Y SALDOS
                            System.out.println("DATOS CUENTA//SALDOS");


                        case 2://TRANSFERENCIAS
                            System.out.println("Seccion TRANSFERENCIAS");
                            System.out.println("Ingrese monto a transferir");
                            monto = miTeclado.nextDouble();
                            if(monto > saldo){
                                System.out.println("No posee saldo suficiente para realizar esta operación");

                            }else{
                            System.out.println("Usted va a transferir: $" + monto + ". ¿Desea continuar? 1 (Continuar) / 2 (cancelar y regresar al menú anterior)");
                            respuesta = miTeclado.nextInt();
                                if(respuesta == rtaSaved){
                                    System.out.println("Se debitarán de su cuenta: $" + monto);
                                    System.out.println("Ingrese CBU DESTINATARIO");
                                    cbu = miTeclado.nextInt();
                                    System.out.println("*****A continuación verifique datos ingresados y confirme operación.*****");
                                    System.out.println("Importe a tranferir $" +monto);
                                    System.out.println("CBU DESTINTARIO:" +cbu);
                                    System.out.println("**************************************");
                                    System.out.println("1-Tranferir.");
                                    System.out.println("2-Cancelar");
                                    System.out.println("**************************************");
                                    respuesta=miTeclado.nextInt();
                                }if((respuesta == rtaSaved)){
                                    System.out.println("Operación exitosa! Se han trasnferido $" + monto + " de su cuenta al CBU N° " + cbu +". Su saldo actual es de: $" + (saldo-monto));
                                    System.out.println("**************************************");
                                }else{
                                    System.out.println("Operación cancelada");
                                    System.out.println("**************************************");

                                }
                            }
                            System.out.println("*****Aguarde y será redirigido al menu de opciones*****");
                            System.out.println("**********************************************************");
                            break;
                        case 3://PAGO DE SERVICIOS
                            System.out.println("Seccion PAGOS");
                            System.out.println("Pendiente de pago - CABLEVISION FIBERTEL. Monto a abonar: $" + cable);
                            System.out.println("Pendiente de pago - IMPUESTO INMOBILIARIO. Monto a abonar: $"+ inmbobiliario);
                            System.out.println("Pendiente de pago - IMPUESTO AUTOMOTOR. Monto a abonar: $" + automotor);
                            System.out.println("El monto total a pagar es de: $" + totalPagos);
                            System.out.println("¿Desea proceder al pago de lo mismos? 1- para Continuar / 2- para terminar");
                            respuesta = miTeclado.nextInt();
                            if(respuesta == rtaSaved){
                                System.out.println("Se debitarán de su cuenta: $" + totalPagos);
                                System.out.println("1- Confirmar y pagar.");
                                System.out.println("1- Cancelar y regresar el menú anterior.");

                                respuesta=miTeclado.nextInt();
                            }if((totalPagos <= saldo ) && (respuesta == rtaSaved)){
                                System.out.println("Pagos realizados con éxito, se debitó de su cuenta la suma de $" + totalPagos + ". Su saldo actual es: $" +  (saldo - totalPagos));
                            }else if (saldo<totalPagos){
                                System.out.println("Su saldo es insuficiente para realizar la transaccion.");
                            }
                                break;
                        case 4:
                            System.out.println("Gracias por utilizar nuestro sistema de HB. Hasta pronto.");
                            break;
                       }
                    }while((menu != 4));
            }else{
                System.out.println("Cerrando sesion");
            }


       System.out.println("Gracias por utilizar nuestro sistema de HB. Hasta pronto.");



       miTeclado.close();
    }
}
    