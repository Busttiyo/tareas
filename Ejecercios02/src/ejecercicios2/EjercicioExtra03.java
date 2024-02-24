/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
equals() de la clase String.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String letra;
        
        System.out.println("ingrese un vocal");
        
        letra = leer.next();
        
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
