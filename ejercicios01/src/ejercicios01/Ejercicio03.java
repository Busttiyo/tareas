/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después 
toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicios01;

import java.util.Scanner;


/**
 *
 * @author david
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frace, fracem, fraceM;
        
        System.out.println("ingrese una frase");
        frace = leer.nextLine();
        
        System.out.println("frace en minuscula : ");
        
        System.out.println("frace en mayusculas : ");
        
    }
    
}
