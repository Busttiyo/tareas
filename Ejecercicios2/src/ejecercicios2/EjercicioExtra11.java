/*
Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, 
el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, aux = 0, inicial;
        
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        
        inicial = num;
        do{
            num = num / 10;
            aux ++;
        }while(num>0);
        
        System.out.println("el numero "+inicial+" tiene un total de "+aux+" digitos");
        
    }
    
}
