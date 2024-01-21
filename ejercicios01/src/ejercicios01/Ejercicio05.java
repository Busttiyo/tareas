/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejercicios01;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero, respuesta;
        
        System.out.println("ingrese un numero");
        numero = leer.nextInt();
        respuesta = numero * 2;
        System.out.println("el doble de ese numero es : "+respuesta);
        
        respuesta = numero * 3;
        System.out.println("el triple de ese numero es : "+respuesta);
        
        respuesta = (int) Math.sqrt(numero);
        System.out.println("la raiz cuadrada de ese numero es : "+respuesta);
        
    }
    
}
