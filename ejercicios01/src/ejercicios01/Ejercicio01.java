/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicios01;

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
        
        int num1, num2, suma;
        
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        
        System.out.println("ingrese otro numero");
        num2 = leer.nextInt();
        suma= num1+num2;
        System.out.println("la suma de los numero "+num1+" y "+num2+" es: "+suma);
    }
    
}
