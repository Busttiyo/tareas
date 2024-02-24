/*
Crear un programa que dado un número determine si es par o impar.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("ingrese un numero");
        
        num = leer.nextInt();
        
        if(num%2==0){
            System.out.println("el numero "+num+" es par");
            
        }else{
            System.out.println("el numero "+num+" es impar");
        }
    }
    
}
