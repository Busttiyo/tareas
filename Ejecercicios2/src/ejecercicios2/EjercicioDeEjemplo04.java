/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioDeEjemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        int sumar = 0;
        int contador = 0;
        int num;
        
        do{
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            contador = contador +1;
            if(num>0){
                sumar = sumar + num;
            }
        }while(num !=0 || contador >= 20 );
        if ( num == 0){
            System.out.println("cero atrapado");
        }
        System.out.println("la suma de todos los numeros ingresados es de: "+sumar);
    }
    
}
