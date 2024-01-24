/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frace;
        
        System.out.println("ingrese la clave");
        
        frace = leer.nextLine();
        
        if (frace.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("incorrecto");
        }
        
        
    }
    
}
