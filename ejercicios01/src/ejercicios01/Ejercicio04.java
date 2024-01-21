/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios01;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int c;
        float f;
        
        System.out.println("ingrese la temperatura en grados celcius");
        c = leer.nextInt();
       
        f = 32 + (9 * c / 5);
        
        System.out.println("los "+c+" grados celcius son "+f+" grados farengeis");
        
    }
    
}
