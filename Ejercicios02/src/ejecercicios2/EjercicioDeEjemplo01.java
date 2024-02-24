/*
Implementar un programa que le pida dos números enteros al usuario y determine 
si ambos o alguno de ellos es mayor a 25.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioDeEjemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("ingrese un numero");
        
        num1 = leer.nextInt();
        
        System.out.println("ingrese otro numero");
        
        num2 = leer.nextInt();
        
        if ( num1>=25 && num2 >= 25 ){
            System.out.println("ambos numeros son mayores o iguales a 25");
        }
        else if ( num1>=25 && num2 < 25 || num1 < 25 && num2 >= 25  ){
            System.out.println("solo un numero de los ingresados es mayor o iguales a 25");
        }
        else{
            System.out.println("ningunos de los numeros ingresados es mayor o igual a 25");
        }
    }
    
}
