/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
 */
package ejercicios01;

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
        String nombre;
        System.out.println("ingrese su nombre porfavor :D");
        nombre = leer.next();
        System.out.println("hola "+nombre+" Como estas?");
        
        
    }
    
}
