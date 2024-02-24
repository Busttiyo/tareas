/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de
esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un 
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
 */
package ejecercicios2;

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
        
        String frace;
        
        System.out.println("ingrese una frace que su primera letra sea A");
        
        frace = leer.nextLine();
        
        if (frace.substring(0, 1).equals("A")|| frace.subSequence(0, 1).equals("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
